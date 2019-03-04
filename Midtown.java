//all levels for Downtown

/*
///// MAP ////////
				
			 ##Uptown##

		________       ________
		|		|  |  | 		|______
		| hotel	|	  | Bank	|	    |
		|_______   |   _________|	    |
        |       	  			        |
		| maket |  |		Park	    |     
________|_______| 	 	     	        |    ##East Village##  
|				|  |   ____________     |
| Work Building 	  |		       |    |
|_______________|  |  |            |____|
	|			|	  |   gym  	     |     
	| gas 			  |				 |
	|  station		  |  	  		 |
	|___________|     |______________|


		 	##Downtown##

*/
import java.util.*;

public class Midtown {

  private static String midtownMap = 
 "              ##Uptown##\n"+
 "                                \n"+
 "         _______       _________ \n"+
 "        |       |  |  |         |______ \n"+
 "        | hotel |     |  Bank   |      | \n"+
 "        |_______   |   _________|      | \n"+
 "        |                              | \n"+
 "        | maket |  |    Park           | \n"+    
 "  ______|_______|      ______          |    ##East Village## \n"+  
 " |              |  |  |      |_        |  \n"+    
 " | Work Building      |  gym   |       | \n"+
 " |______________|  |  |________|_______| \n"+
 "                                       \n"+
 "                                       \n"+
 "              ##Downtown##  ";

  //elevator - exits building - outside level
  public static void midtown(Player player){
    System.out.println();
    //make level
    Levels midtownObj = new Levels(
      "you have exited the elevator and now your outside in Midtown\n" +
      "press \"UT\" to go to Uptown.\n" +
      "press \"DT\" to go to Downtown.\n" +
      "press \"EV\" to go to East Village.\n" +
      "press \"H\" to go to the hotel.\n" +
      "press \"M\" to go to the market.\n" +
      "press \"WB\" to go to the WorkBuilding.\n" +
      "press \"B\" to go to the bank.\n" +
      "press \"P\" to go to the park.\n" +
      "press \"GYM\" to go to the gym.\n",
      "commands: UT, DT, EV, H, M, WB, GS, B, P, GYM "
    );

    //show level description + commands
    midtownObj.showDescription();  
    System.out.println();
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
      midtown(player);
    }


    ///////MID TOWN NAV////////
    else if(input.equals("UT")) {
      player.cls();
      downtown(player);
    }

    else if(input.equals("UT")) {
      player.cls();
      uptown(player);
    }

    else if(input.equals("EV")) {
      player.cls();
      eastVillage(player);
    }

    else if(input.equals("H")) {
      player.cls();
      hotel(player);
    }

    else if(input.equals("M")) {
      player.cls();
      market(player);
    }

    else if(input.equals("WB")) {
      player.cls();
      WorkBuilding hallwayObj = new WorkBuilding();
      hallwayObj.hallway(player);
    }

    else if(input.equals("B")) {
      player.cls();
      bank(player);
    }

    else if(input.equals("P")) {
      player.cls();
      park(player);
    }

    else if(input.equals("GYM")) {
      player.cls();
      gym(player);
    }

    ///////END MIDTOWN NAV//////


    //see map
    else if(input.equals("map")) {
      player.cls();
      map();
      midtown(player);
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
      midtown(player);
    }
  }


  //uptown
  public static void uptown(Player player){
  	System.out.println("your in uptown");
  }

  //downtown
  public static void downtown(Player player){
  	System.out.println("your in downtown");
  }

  //eastVillage
  public static void eastVillage(Player player){
  	System.out.println("your in eastVillage");
  }

  //hotel
  public static void hotel(Player player){
  	System.out.println("your in the hotel");
  }

  //market
  public static void market(Player player){
  	System.out.println("your in the market");
  }

  //bank
  public static void bank(Player player){
  	System.out.println("your in the bank");
  }

  //park
  public static void park(Player player){
  	System.out.println("your in the park");
  }

  //gym
  public static void gym(Player player){
  	System.out.println("your in the gym.");
  }

  //map
  public static void map(){
  	System.out.println(midtownMap);				
    
  }

	
}