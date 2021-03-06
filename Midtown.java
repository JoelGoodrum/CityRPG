//all levels for Downtown

/*
///// MAP ////////
				
 "               #Uptown#\n"+
 "                                \n"+
 "         _______       _________ \n"+
 "        |       |  |  |         |______ \n"+
 "        | hotel |     |  Bank   |      | \n"+
 "        |_______   |   _________|      | \n"+
 "        |                              | \n"+
 "        |market |  |    Park           | \n"+    
 "  ______|_______|      ______          |    ##East Village## \n"+  
 " |              |  |  |      |_        |  \n"+    
 " | Work Building         gym   |       | \n"+
 " |______________|||||||________|_______| \n"+
 "               =       =               \n"+
 " #W.Beach# --  --  --  =       =  --  --     \n"+
 "               =       =               \n"+
"   ------------- ||||||| ---------------\n"+
"                                        \n"+
 "              #Downtown#  ";

*/
import java.util.*;

public class Midtown {

  private static String midtownMap = 
 "               #Uptown#        \n"+
 "                                \n"+
 "         _______       _________ \n"+
 "        |       |  |  |         |______ \n"+
 "        | hotel |     |  Bank   |      | \n"+
 "        |_______   |   _________|      | \n"+
 "        |                              | \n"+
 "        |market |  |    Park           | \n"+    
 "  ______|_______|      ______          | \n"+  
 " |              |  |  |      |_        |  \n"+    
 " | Work Building         gym   |       | \n"+
 " |______________|||||||________|_______| \n"+
 "               =       =               \n"+
 " #W.Beach# --  =       =  --  --  --     #East Village#\n"+
 "               =       =               \n"+
 "  ------------- ||||||| ---------------\n"+
 "                                        \n"+
 "              #Downtown#  ";

  //elevator - exits building - outside level
  public static void midtown(Player player){
   
    //print map
    System.out.println(midtownMap);

    //make level
    Levels midtownObj = new Levels(
      "you have exited the elevator and now your outside in Midtown\n" +
      "press \"UT\" to go to Uptown.\n" +
      "press \"DT\" to go to Downtown.\n" +
      "press \"EV\" to go to East Village.\n" +
      "press \"WB\" to go to West Beach.\n" +
      "press \"H\" to go to the hotel.\n" +
      "press \"M\" to go to the market.\n" +
      "press \"WO\" to go to the WorkBuilding.\n" +
      "press \"B\" to go to the bank.\n" +
      "press \"P\" to go to the park.\n" +
      "press \"GYM\" to go to the gym.\n",
      "commands: UT, DT, EV, WB, H, M, WO, B, P, GYM "
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
      uptown(player);
    }

    else if(input.equals("DT")) {
      player.cls();
      downtown(player);
    }

    else if(input.equals("EV")) {
      player.cls();
      eastVillage(player);
    }

    //hotel
    else if(input.equals("H")) {
      player.cls();
      hotel(player);
    }

    //market
    else if(input.equals("M")) {
      player.cls();
      market(player);
    }

    //work building
    else if(input.equals("WO")) {
      player.cls();
      WorkBuilding hallwayObj = new WorkBuilding();
      hallwayObj.hallway(player);
    }

    //west beach  
    else if(input.equals("WB")) {
      player.cls();
      WestBeach town = new WestBeach();
      town.wBeach(player);
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

    //uptown object
    Uptown UpT = new Uptown();
    UpT.uptown(player);

  }

  //downtown
  public static void downtown(Player player){
  	Downtown town = new Downtown();
    town.downtown(player);
  }

  //eastVillage
  public static void eastVillage(Player player){
  	System.out.println("your in eastVillage");
    returnToMidtown(player);
  }

  //hotel
  public static void hotel(Player player){
  	System.out.println("your in the hotel");
    returnToMidtown(player);
  }

  //market
  public static void market(Player player){
  	System.out.println("your in the market");
    returnToMidtown(player);
  }

  //bank
  public static void bank(Player player){
  	System.out.println("your in the bank");
    returnToMidtown(player);
  }

  //park
  public static void park(Player player){
  	System.out.println("your in the park");
    returnToMidtown(player);
  }

  //gym
  public static void gym(Player player){
  	System.out.println("your in the gym.");
    returnToMidtown(player);
  }

  //return to midtown
  public static String returnToMidtown(Player player){

    Scanner console = new Scanner(System.in);
    String output = console.next();
    System.out.println();

    //take input
    //if input == MT
    //return to midtown
    if(output.equals("MT")){
      player.cls();
      System.out.println(output);
      midtown(player);
    }

    return output;

  }
  //map
  public static void map(){
  	System.out.println(midtownMap);				
    
  }

	
}