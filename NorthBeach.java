/*
      _____________________
~ ~ ~|  |     = _  _  _  _     #Uptown# 
~ ~ ~|  |     =  __________ 
~ ~ ~|  ||||||| | Five     |
 ~ ~ |  |     | | Star Inn |
~ ~ ~|  |  |  | |__________|
 ~ ~ |  |     | |          |
~ ~ ~|  |  |  | | N.Beach  |    
~ ~ ~|  |     | | Pizza    |
~ ~ ~|  |  |  | |__________|       
 ~ ~ |  |     | | skate   |   
~ ~ ~|  |  |  | | park  __|
~ ~ ~|  |     | |______|

		#W.Beach#

*/
import java.util.*;
public class NorthBeach {

	private static String map =
"	      ___________________    \n"+
"~ ~ ~|  |     = _  _  _  _     #Uptown#   \n"+ 
"~ ~ ~|  |     =  __________     \n"+
"~ ~ ~|  ||||||| | Five     |    \n"+
" ~ ~ |  |     | | Star Inn |    \n"+
"~ ~ ~|  |  |  | |__________|    \n"+
" ~ ~ |  |     | |          |    \n"+
"~ ~ ~|  |  |  | | N.Beach  |    \n"+
"~ ~ ~|  |     | | Pizza    |    \n"+
"~ ~ ~|  |  |  | |__________|    \n"+   
" ~ ~ |  |     | | skate   |     \n"+
"~ ~ ~|  |  |  | | park  __|     \n"+
"~ ~ ~|  |     | |______|        \n"+ 
"                               \n"+
" 		#W.Beach#             \n"+
" ";


	//nBeach level
	public static void nBeach(Player player) {

		//display map
		System.out.println(map);

		//level objects
	    Levels NorthBeach = new Levels(
	      "your in North Beach.\n" +
	      "press \"UT\" to go to Uptown.\n" +
	      "press \"W\" to go to West Beach.",
	      "commands: UT, W, "
	    );
	    
	    //show level description + commands
	    NorthBeach.showDescription();  
	    player.showCommands();

	    //player input
	    System.out.print("\nyour command: ");
	    Scanner console = new Scanner(System.in);
	    String input = console.next();
	    System.out.println();

	    //check for basic commands before nav
	    String output = player.commandInput(input);
	    if(output.length() > 0){
      		player.cls();
      		System.out.println(output);
     		nBeach(player);
    	}	

    	//N.Beach NAV//

    	//uptown
    	else if(input.equals("UT")) {
      		player.cls();
      		Uptown town = new Uptown();
      		town.uptown(player);
    	}

    	//westBeach
    	else if(input.equals("W")) {
      		player.cls();
      		WestBeach town = new WestBeach();
      		town.wBeach(player);
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
	      nBeach(player);
	    }
	}

}