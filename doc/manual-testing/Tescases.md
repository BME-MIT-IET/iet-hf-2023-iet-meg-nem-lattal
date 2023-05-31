Manual test tescases based on the Use-Cases of the program

1. View map
    a) The game displays the map, and refreshes it upon player action
    b) The map's features are clean coded, the user can understand everything
    c) The interactions with the UI are clean and easy to understand
    d) The game is reactive, the UI doesn't freezes
    e) The players take turns to act
2. Use agent
    a) The player can learn agents
        Testing for every agent
    b) The player can craft the knows agents
        Testing for every agent
    c) The player can use the agent on another player
        Testing for every agent, also testing for immunity
3. Use item
    a) A player pick up an item
        Testing for every item
    b A player equips an item in the shelter
        A player tries to wear more than 3 items, but fails
    c) A player uses an item
        Test for every item

4. Move player
    a) The player steps in a direction
        Check for every direction
        Check for every tipe of field
    b) The player interacts with the field
    c) The player meets another player


TestCase runs and findings:
    1.) Starting the game and viewing the map
         -Starting screen doesn't fit the text
         -Lack of explanation of features - unclear symbols, I don't know which field is what kind
         -Lack of user responsivness - I don't know what happens when I press buttons, or press on the map
         +The UI is not freezing with player interactions
         -I have to press the Next button, even through my turn is over and I can't do anything
         -The map generations can be unfair, as it is random

    2.) The player uses agents
        -The player can learn the same agent multiple times
        -The crafting cost is random
        +The crafting is user responsive
        +The player can craft agents
        -Spelling mistake in crafting's popup message
        -Can't see the effect's on the virologist - bear dance agent is impossible to play againts
        -Can't use agent on other player, beacuse targeting is unclear, or doesn't work

    3.) The player uses items
         +The player can equip items
         -The player can't see the equipped items, only on the unequip screen
         +The player can unequip items
         -Can't test using items because of the movement bug

    4.) Moving around the players on the map
         -Every player moves at the same time - I don't know if my actions suceeded or not
         -Hard to know how to move, and where to move
         -Meeting player's overlap
         -The interactions with the map doesn't give me anything, things just apear in my inventory
         +Can change move directions
         --Movement stops to work after some rounds



