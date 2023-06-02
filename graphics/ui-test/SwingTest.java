import main.Main;
import org.assertj.swing.assertions.Assertions;
import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.core.ComponentLookupScope;
import org.assertj.swing.core.Robot;
import org.assertj.swing.core.matcher.FrameMatcher;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.edt.GuiQuery;
import org.assertj.swing.finder.WindowFinder;
import org.assertj.swing.fixture.DialogFixture;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.fixture.JOptionPaneFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class SwingTest {

    private static FrameFixture window;
    private static Robot robot;

    @BeforeClass
    public static void setUp() {
        robot = BasicRobot.robotWithCurrentAwtHierarchy();
        System.out.println("setup");
    }

    @Before
    public void Set() {
        Main.main(new String[0]);
        robot.settings().componentLookupScope(ComponentLookupScope.ALL);
        FrameFixture menuWindow = WindowFinder.findFrame(FrameMatcher.withTitle("The world of worldless virologists").andShowing())
                .withTimeout(2, TimeUnit.SECONDS)
                .using(robot);
        menuWindow.button().click();
        window = WindowFinder.findFrame(FrameMatcher.withTitle("The world of worldless virologists").andShowing())
                .withTimeout(2, TimeUnit.SECONDS)
                .using(robot);
        System.out.println("set");
    }

    @Test
    public void TestCraftAlert(){
        window.button("craft").click();
        JOptionPaneFixture alert = window.optionPane();
        alert.requireTitle("You can't craft!");
        alert.requireMessage("You don't know any code!");
    }

    @Test
    public void TestAgentAlert() {
        window.button("agent").click();
        JOptionPaneFixture alert = window.optionPane();
        alert.requireTitle("You can't use agent!");
        alert.requireMessage("You have no agent!");
    }

    @Test
    public void TestEquipAlert() {
        window.button("equip").click();
        JOptionPaneFixture alert = window.optionPane();
        alert.requireTitle("You have no equipment!");
        alert.requireMessage("You have no equipment!");
    }

    @Test
    public void TestUnequipAlert() {
        window.button("buttonUnequip").click();
        JOptionPaneFixture alert = window.optionPane();
        alert.requireTitle("You have no active equipment!");
        alert.requireMessage("You have no active equipment!");
    }

    //works only by running individually
    @Test
    public void TestDropAlert() {
        window.button("drop").click();
        JOptionPaneFixture alert = window.optionPane();
        alert.requireTitle("You have no equipment!");
        alert.requireMessage("You have no equipment!");
    }

    @Test
    public void TestStealDialog() {
        window.button("steal").click();
        DialogFixture dialog = window.dialog();
        dialog.requireVisible();
        String title = dialog.target().getTitle();
        assertEquals(title, "Steal");
    }

    @Test
    public void TestCode() {
        int x = 150;
        int y = 120;
        for(int i = 0; i < 7; i++) {
            for(int k = 0; k < 4; k++) {
                window.button("next").click();
            }
            window.button("interact").click();

            x+=100;
            Point point = new Point(x,y);
            window.robot().click(window.target(), point);

            JLabel label = null;
            try {
                label = GuiActionRunner.execute(new GuiQuery<JLabel>() {
                    protected JLabel executeInEDT() {
                        return (JLabel) window.robot().finder().findByName("jlcode0");
                    }
                });
            }
            catch (Exception e) {}

            if(label != null) {
                Assertions.assertThat(label.getText().matches("Code - .*"));
            }
        }
    }

    @Test
    public void TestEquip() {
        int x = 150;
        int y = 120;
        for(int i = 0; i < 7; i++) {
            for(int k = 0; k < 4; k++) {
                window.button("next").click();
            }
            window.button("interact").click();

            x+=100;
            Point point = new Point(x,y);
            window.robot().click(window.target(), point);

            JLabel label = null;
            try {
                label = GuiActionRunner.execute(new GuiQuery<JLabel>() {
                    protected JLabel executeInEDT() {
                        return (JLabel) window.robot().finder().findByName("jlequip0");
                    }
                });
            }
            catch (Exception e) {}

            if(label != null) {
                Assertions.assertThat(
                    label.getText().matches("Cape") ||
                          label.getText().matches("Bag") ||
                          label.getText().matches("Axe") ||
                          label.getText().matches("Gloves"));
            }
        }
    }

    @After
    public void tearDown() {
        window.cleanUp();
        System.out.println("teardown");
    }
}
