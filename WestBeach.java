//weast beach
/*
      ##North Beach##

~ ~ ~|  |  |  | |  Tattoo |
 ~ ~ |  |     | |  Shop   |
~ ~ ~|  |  |  | |_________|
 ~ ~ |  |     | |          |
~ ~ ~|  |  |  | | W.Beach  |    
~ ~ ~|  |     | | Dine     |
~ ~ ~|  |  |  | |__________|       
 ~ ~ |  |     | |        |   
~ ~ ~|  |  |  | | bar    |
~ ~ ~|  |     | |________|     
~ ~ ~|  |     = _  _  _  _    ##Midtown## 
~ ~ ~|  |     =  _________ 
	 #South Beach#

*/
import java.util.*;

//west beach class
public class WestBeach {
	//west beach map
	private static String map =
	" 	      ##North Beach##  \n"+
	"                          \n"+
	"~ ~ ~|  |  |  | |  Tattoo | \n"+
	" ~ ~ |  |     | |  Shop   | \n"+
	"~ ~ ~|  |  |  | |_________| \n"+
	" ~ ~ |  |     | |          |\n"+
	"~ ~ ~|  |  |  | | W.Beach  |    \n"+
	"~ ~ ~|  |     | | Dine     |\n"+
	"~ ~ ~|  |  |  | |__________|       \n"+
	" ~ ~ |  |     | |        |   \n"+
	"~ ~ ~|  |  |  | | bar    |\n"+
	"~ ~ ~|  |     | |________|\n"+     
	"~ ~ ~|  |     = _  _  _  _    ##Midtown## \n"+
	"~ ~ ~|  |     =  _________ \n"+
	"                            \n"+
	"      #South Beach#          ";

	//west beach level
	public static void wBeach(Player player){
		//print map
		System.out.println(map);

		//level objects
	    Levels WestBeach = new Levels(
	      "your in West Beach.\n" +
	      "press \"NB\" to go to North Beach.\n" +
	      "press \"SB\" to go to South Beach.\n" +
	      "press \"MT\" to go to Midtown.",
	      "commands: NB, MT, SB, "
	    );
	    
	    //show level description + commands
	    WestBeach.showDescription();  
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
     		wBeach(player);
    	}	

    	//N.Beach NAV//

    	//uptown
    	else if(input.equals("MT")) {
      		player.cls();
      		Midtown town = new Midtown();
      		town.midtown(player);
    	}

    	//westBeach
    	else if(input.equals("NB")) {
      		player.cls();
      		NorthBeach town = new NorthBeach();
      		town.nBeach(player);
    	}

    	//South Beach 
    	else if(input.equals("SB")) {
      		player.cls();
      		SouthBeach town = new SouthBeach();
      		town.sBeach(player);
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
	      wBeach(player);
	    }
	}
	
}