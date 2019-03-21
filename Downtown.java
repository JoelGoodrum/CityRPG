//Downtown level

/*
"              ##Midtown##\n"+
 "                                \n"+
 "       ___________       _________ \n"+
 "      |           |     |         |\n"+
 "      | Burger Js |  |  |  Bank   |       \n"+
 "      |___________|     |_________|       \n"+
 "     |            |  |  |          |      \n"+
 "     | May Apts.  |     | Car Shop |      \n"+    
 "    _|____________|  |  |          |      \n"+  
 "    |             |     |          |    \n"+    
 "    |   Shopping  |||||||__________|          \n"+
 "    |    Center   |      ==                   \n"+
 "    |             |      ==  --  --    ##Gov District##   \n"+
 "    |             |      ==                      \n"+
 "    |             |      ----------             \n"+
 "	  |_____________|||||||__________           \n"+
 "         
 "			    
*/

//downtown class
import java.util.*; 
public class Downtown {

	private static String map =
	 "                ##Midtown##\n"+
	 "                                \n"+
	 "       ___________       _________ \n"+
	 "      |           |     |         |\n"+
	 "      | Burger Js |  |  |  Bank   |       \n"+
	 "      |___________|     |_________|       \n"+
	 "     |            |  |  |          |      \n"+
	 "     | May Apts.  |     | Car Shop |      \n"+    
	 "    _|____________|  |  |          |      \n"+  
	 "    |             |     |          |    \n"+    
	 "    |   Shopping  |||||||__________|          \n"+
	 "    |    Center   |      ==                   \n"+
	 "    |             |      ==  --  --    ##Gov District##   \n"+
	 "    |             |      ==                      \n"+
	 "    |             |      ----------             \n"+
	 "	  |_____________|||||||__________           \n"+
	 "         ";
      

	//downtown level
	public static void downtown(Player player){

		//print map
		System.out.println(map);

		//level objects
	    Levels downtownObj = new Levels(
	      "you're in Downtown.\n" +
	      "press \"MT\" to go to Midtown.\n" +
	      "press \"G\" to go to Government District",
	      "commands: S, C, "
	    );
	      
    
	    
	    //show level description + commands
	    downtownObj.showDescription();  
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
     		downtown(player);
    	}	

    	//Downtown Nav//

    	//midtown 
    	else if(input.equals("MT")) {
      		player.cls();
      		Midtown town = new Midtown();
      		town.midtown(player);
    	}

    	//gov district
    	else if(input.equals("G")) {
      		player.cls();
      		GovDistrict town = new GovDistrict();
      		town.govDistrict(player);
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
	      downtown(player);
	    }

	}

}