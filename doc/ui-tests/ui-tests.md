# UI tesztek

A UI tesztek elkészítéséhez AssertJ Swing és JUnit keretrendszert használtam. A keretrendszer lehetőséget ad a Java Swing objektumok elérésére, és rajtuk különböző tesztek futtatására.
A tesztek elsősorban a Swing elemeket tesztelik, és a graphics/ui-test/SwingTest.java fájlban találhatók.
A tesztek leírásai:

### TestEquip
Teszteli, hogy amennyiben a játékos megszerzett egy felszerelést a térképen a megfelelő mezőről, akkor megjelenik-e a játékablakban jobboldalt a megfelelő felirat tájékoztatva a játékost arról, megszerzett egy felszerelést.
Tekintve, hogy a térkép minden különböző indításakor a játéknak random, ezért ez olyan módon történik, hogy az első játákos minden alkalommal jobbra lépked a pályán, és amennyiben az assertj segítségével észlelni lehet, egy jobboldalt megjelenő plusz JLabelt, akkor ellenőrzöm, hogy a label szövege megegyezik-e valamelyik eszköz nevével.

### TestCode
Teszteli, hogy amennyiben a játékos megszerzett egy kódot a térképen megfelelő mezőről, akkor megjelenik-e a játékablakon a jobboldalt a megfelelő felirat tájékoztatva a játékost arról, hogy ő valóban birtokában van a kódnak.
Ez olyan módon történik, hogy az első játákos minden alkalommal jobbra lépked a pályán, és amennyiben az assertj segítségével észlelni lehet, egy jobboldalt megjelenő plusz JLabelt, akkor ellenőrzöm, hogy a label a megfelelő Code stringgel kezdődik-e.

## TestStealDialog
Teszteli, hogy a játékos amennyiben a Steal gombot nyomja meg, megjelenik-e egy dialógusablak, amiben kiválaszhatja azt a játékost, akitől lopni szeretne.

Az következő négy teszt feladata tesztelni, hogy a játékosok figyelmeztetve vannak-e arról, hogy ha a megfelelő eszközök hiányában próbálnak a gombokkal elérhető műveletet végrehajtani, akkor a megfelelő alertekkel tájékoztatva vannak-e a cselekedet sikertelenségéről.

### TestCraftAlert
Teszteli, hogy a játékos, amennyiben úgy próbál meg "craftolni", hogy nem rendelkezik egy megtanult kóddal, akkor a játék feldob-e egy alertet tájékoztatva a játékost a művelet sikertelenségéről. Ehhez az AssertJSwing segítségével a "craft" gomb megnyomását szimulálom, majd asszertálom, hogy létezik-e egy alert dialog a megfelelő felirattal.

### TestAgentAlert
Teszteli, hogy a játékos, amennyiben úgy próbál meg ágenst felhasználni, hogy nem rendelkezik egy elkészített ágenssel, akkor a játék feldob-e egy alertet tájékoztatva a játékost a művelet sikertelenségéről. Ehhez az AssertJSwing segítségével a "Use Agent" gomb megnyomását szimulálom, majd asszertálom, hogy létezik-e egy alert dialog a megfelelő felirattal.

### TestEquipAlert
Teszteli, hogy a játékos, amennyiben úgy próbál meg felöltözni egy felszerelésbe, hogy nem rendelkezik egy megszerzett felszereléssel sem, akkor a játék feldob-e egy alertet tájékoztatva a játékost a művelet sikertelenségéről. Ehhez az AssertJSwing segítségével a "equip" gomb megnyomását szimulálom, majd asszertálom, hogy létezik-e egy alert dialog a megfelelő felirattal.

### TestUnequipAlert
Teszteli, hogy a játékos, amennyiben úgy próbál meg levetkőzni egy felszerelést, hogy nincsen egy felszerelésbe öltözve sem, akkor a játék feldob-e egy alertet tájékoztatva a játékost a művelet sikertelenségéről. Ehhez az AssertJSwing segítségével a "unequip" gomb megnyomását szimulálom, majd asszertálom, hogy létezik-e egy alert dialog a megfelelő felirattal.

### TestDropAlert
Teszteli, hogy a játékos, amennyiben úgy próbál meg eldobni egy felszerelést, hogy nincsen egy felszerelésbe öltözve sem, vagy nincs nála felszerelés, akkor a játék feldob-e egy alertet tájékoztatva a játékost a művelet sikertelenségéről. Ehhez az AssertJSwing segítségével a "drop" gomb megnyomását szimulálom, majd asszertálom, hogy létezik-e egy alert dialog a megfelelő felirattal.