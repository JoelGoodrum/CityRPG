import java.io.*;
//have all the levels in WorkBuilding
/*
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

public class WorkBuilding {
	

  //cubacle level
  public static void cubacle(Player player) {

    //make level
    Levels cubacleObj = new Levels(
      "your in your cubacle and its such a boring day.\n" +
      "press \"S\" to go to the social room.\n" +
      "press \"C\" to log on computer.\n",
      "commands: S, C, "
    );

    //show level description + commands
    cubacleObj.showDescription();  
    player.showCommands();

    //player input
    System.out.print("\nyour command: ");
    Scanner console = new Scanner(System.in);
    String input = console.next();
    System.out.println();

    //take input
    //if input == constant input
    //display constant input
    String output = player.commandInput(input);
    if(output.length() > 0){
      cls();
      System.out.println(output);
      cubacle(player);
    }

    //social room nav
    else if(input.equals("S")) {
      cls();
      socialRoom(player);
    }

    //log on computer
    else if(input.equals("C")) {
      cls();
      System.out.println("nothing special on my Facebook\n");
      cubacle(player);
    }


    //exit game
    else if(input.equals("exit")){
      System.out.println("thank you for playing.");
    }
    
    //if input is invalid
    //display message input invalid message
    else {
      cls();
      System.out.println("invalid command, try again.\n");
      cubacle(player);
    }

  }


  //social room lvl
  public static void socialRoom(Player player) {
    //make level
    Levels socialRoomObj = new Levels(
      "your in the social room.\n" +
      "theres a ping pong table, couch, tv, and a soda machine\n" +
      "press \"CB\" to go to your cubacle.\n" +
      "press \"H\" go to the hallway.\n",
      "commands: CB, H, "
    );

    //show level description
    socialRoomObj.showDescription();
    player.showCommands();
    System.out.print("\nyour command: ");

    //player input
    Scanner console = new Scanner(System.in);
    String input = console.next();
    System.out.println();

    //take input
    //if input == constant input
    //display constant input
    String output = player.commandInput(input);
    if(output.length() > 0){
      cls();
      System.out.println(output);
      socialRoom(player);
    }

    //return to cubacle room nav
    else if(input.equals("CB")) {
      cls();
      System.out.println();
      cubacle(player);
    }

    //log on computer
    else if(input.equals("H")) {
      cls();
      System.out.println();
      hallway(player);
    }


    //exit game
    else if(input.equals("exit")){
      System.out.println("thank you for playing.");
    }
    
    //if input is invalid
    //display message input invalid message
    else {
      cls();
      System.out.println("invalid command, try again.\n");
      socialRoom(player);
    }
  	 
  }


  //hallway level
  public static void hallway(Player player) {
    //make level
    Levels hallwayObj = new Levels(
      "your in the hallway.\n" +
      "the walls are gray and theres are waterfountains.\n" +
      "press \"E\" to go to the elevator.\n" +
      "press \"S\" go to the socialRoom.\n",
      "commands: E, S, "
    );

    //show level description
    hallwayObj.showDescription();
    player.showCommands();
    System.out.print("\nyour command: ");

    //player input
    Scanner console = new Scanner(System.in);
    String input = console.next();
    System.out.println();

    //take input
    //if input == constant input
    //display constant input
    String output = player.commandInput(input);
    if(output.length() > 0){
      cls();
      System.out.println(output);
      hallway(player);
    }

    //level nav to elevator
    else if(input.equals("E")) {
      cls();

      //access to OutSide level
      OutSide outside = new OutSide();

      outside.frontOfBuilding(player);
    }

    //level nav to social room
    else if(input.equals("S")) {
      cls();
      socialRoom(player);
    }

  }

  
  //clear cmd 
  //code from https://stackoverflow.com/questions/2979383/java-clear-the-console
  public static void cls(){
    //Clears Screen in java
    try {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
            System.out.println();
    } catch (IOException | InterruptedException ex) {}
  }
  //end code from https://stackoverflow.com/questions/2979383/java-clear-the-console 


}