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

//SYNTAX//
level methods will just be the name of the level
ex.
public static void level(){
  
}
methods are responsible for manuvering through the map

level object will end with Obj at the end
ex.
levelObj
level objects will store the levels data

*/
import java.util.*;
import java.io.*;

public class CityRPG {
//main method is responsible for running the game

  public static void main(String[] args) {

    System.out.println();

    //make player obj
    Player player = new Player();
    player.cls();

    //access levels
    WorkBuilding workBuilding = new WorkBuilding();

    //start game
    workBuilding.cubacle(player);
    
  }


}