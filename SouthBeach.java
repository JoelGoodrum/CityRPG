//south beach

/*
		##West Beach##

~ ~ ~|  |  |  | |         |
 ~ ~ |  |     | |  club   |
~ ~ ~|  |  |  | |_________|
 ~ ~ |  |     | |          |
~ ~ ~|  |  |  | | S.Beach  |    
~ ~ ~|  |     | | Inn      |
~ ~ ~|  |  |  | |__________|       
 ~ ~ |  |     | | S.Beach  |   
~ ~ ~|  |  |  | |Apartments|
~ ~ ~|__|_____|_|__________|     


*/
//SouthBeach class
import java.util.*;

public class SouthBeach{

	//sBeach map
	private static String map =
	"			##West Beach##\n"+
	"                           \n"+
	"~ ~ ~|  |  |  | |         |\n"+
	" ~ ~ |  |     | |  club   |\n"+
	"~ ~ ~|  |  |  | |_________|\n"+
	" ~ ~ |  |     | |          |\n"+
	"~ ~ ~|  |  |  | | S.Beach  |    \n"+
	"~ ~ ~|  |     | | Inn      |\n"+
	"~ ~ ~|  |  |  | |__________|       \n"+
	" ~ ~ |  |     | | S.Beach  |   \n"+
	"~ ~ ~|  |  |  | |Apartments|\n"+
	"~ ~ ~|__|_____|_|__________|\n"+
	" ";

	//sBeach level	
	public static void sBeach(Player player){
		//print map
		System.out.println(map);

		//level objects
	    Levels SouthBeach = new Levels(
	      "your in South Beach.\n" +
	      "press \"WB\" to go to West Beach.",
	      "commands: WB, "
	    );
	    
	    //show level description + commands
	    SouthBeach.showDescription();  
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
     		sBeach(player);
    	}	

    	//S.Beach NAV//

    	//west beach
    	else if(input.equals("WB")) {
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
	      sBeach(player);
	    }
	}
	
}