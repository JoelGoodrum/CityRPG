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
	
  private static String WorkBuildingMap =          
  "       _____________________\n"+
  "       |                   |\n"+
  "       | cubacles          |\n"+
  " ______|            _______|\n"+
  " |               __|\n"+
  " | social room  |_____\n"+
  " |________________    |\n"+
  "        |             |___________\n"+
  "        | hallway       elevator  |\n"+
  "        |______________           |\n"+
  "                      |___________|\n";

  //cubacle level
  public static void cubacle(Player player) {
    //display map
    System.out.println(WorkBuildingMap);
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
      player.cls();
      System.out.println(output);
      cubacle(player);
    }

    //social room nav
    else if(input.equals("S")) {
      player.cls();
      socialRoom(player);
    }

    //log on computer
    else if(input.equals("C")) {
      player.cls();
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
      player.cls();
      System.out.println("invalid command, try again.\n");
      cubacle(player);
    }

  }


  //social room lvl
  public static void socialRoom(Player player) {
    //display map
    System.out.println(WorkBuildingMap);
    //make level
    Levels socialRoomObj = new Levels(
      "your in the social room.\n" +
      "theres a ping pong table, couch, tv, and a vending machine\n" +
      "press \"CB\" to go to your cubacle.\n" +
      "press \"V\" to go to vending machine \n" +
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
      player.cls();
      System.out.println(output);
      socialRoom(player);
    }

    //return to cubacle room nav
    else if(input.equals("CB")) {
      player.cls();
      System.out.println();
      cubacle(player);
    }

    //go to vending machine
    else if(input.equals("V")) {
      player.cls();
      vendingMachine(player);
    }

    //log on computer
    else if(input.equals("H")) {
      player.cls();
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
      player.cls();
      System.out.println("invalid command, try again.\n");
      socialRoom(player);
    }
  	 
  }


  //hallway level
  public static void hallway(Player player) {
    //display map
    System.out.println(WorkBuildingMap);

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
      player.cls();
      System.out.println(output);
      hallway(player);
    }

    //level nav to elevator
    else if(input.equals("E")) {
      player.cls();

      //access to midtown level
      Midtown outside = new Midtown();

      outside.midtown(player);
    }

    //level nav to social room
    else if(input.equals("S")) {
      player.cls();
      socialRoom(player);
    }

  }

  //vending machine
  public static void vendingMachine(Player player){

    //machine variables
    String[] machineItems = {"coke","pepsi"};
    double[] machinePrice = {2.00, 3.50};
    //vending machine obj and items
    VendingMachine machine = new VendingMachine(
      machineItems, machinePrice
    );

    //display vendingMachine level
    machine.printItems();
    System.out.println("press \"S\" to return to the social room");
    player.showCommands();
    System.out.print("\nyour command: ");

    //display commands

    //take player input
    Scanner console = new Scanner(System.in);
    String input = console.next();
    System.out.println();

     //take input
    //if input == constant input
    //display constant input
    String output = player.commandInput(input);
    if(output.length() > 0){
      player.cls();
      System.out.println(output);
      vendingMachine(player);
    }

    if(input.equals("coke")){
      player.cls();
      machine.buyItem(machine, "coke", player);
      vendingMachine(player);
    }

    else if(input.equals("pepsi")){
      player.cls();
      machine.buyItem(machine, "pepsi", player);
      vendingMachine(player);
    }

    else if(input.equals("S")){
      player.cls();
      socialRoom(player);
    }

    else if(input.equals("exit")){
      System.out.println("thank you for playing");
    }

    else {
      System.out.println("invalid");
      vendingMachine(player);
    }


  }


}