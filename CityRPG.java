/////City RPG/////
/*
The player will be a rat and will be able to traverse levels
get items 
die or win the game

commands will be
[specific level commands], health, items, cash

////game layout/////
level description [text]
commands: [text]
user input: ...

level description [text]
commands: [text]
user input: ...
////////////////////

level objects allow user to display description when needed
methods allow user to traverse through objects

////MAP//////
         _____________________
         |                   |
         | cubacles          |
 ________|          _________|
 |               __|
 | social room  |________
 |________              |
          |             |___________
          | hallway       elevator  |
          |______________           |
                        |___________|

*/
import java.util.*;

public class CityRPG {
//main method is responsible for running the game

  public static void main(String[] args) {

    //make player obj
    Player player = new Player();

    //access levels
    WorkBuilding workBuilding = new WorkBuilding();

    //start game
    workBuilding.playerCubacle(player);
    
  }

}