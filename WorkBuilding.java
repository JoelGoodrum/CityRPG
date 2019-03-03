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

public class WorkBuilding extends Player {
	
  // level
  public static void playerCubacle(Player player) {

    //make level
    Levels pipe1 = new Levels(
      "your in your cubacle and its such a boring day.\n" +
      "press \"S\" to go to the social room.\n" +
      "press \"C\" to log on computer.\n",
      "commands: S, C, "
    );

    //show level description
    System.out.println(pipe1.description);

    //show commands
    System.out.print(pipe1.commands);
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
      System.out.println(output);
      playerCubacle(player);
    }

    //social room nav
    else if(input.equals("S")) {
      socialRoom(player);
    }

    //log on computer
    else if(input.equals("C")) {
      System.out.println("nothing special on my Facebook\n");
      playerCubacle(player);
    }


    //exit game
    else if(input.equals("exit")){
      System.out.println("thank you for playing.");
    }
    
    //if input is invalid
    //display message input invalid message
    else {
      System.out.println("invalid command, try again.\n");
      playerCubacle(player);
    }

  }


  //social room lvl
  public static void socialRoom(Player player) {
  	System.out.println("not much to do here.");  
  }

}