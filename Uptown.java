//uptown map
//theatre, restaurants
/*

 "		 ______________________________						"
 "                  =     =
 " #North   --  --  =     = --  --  --             #School District# "
 " Beach# _________ =     =____________  \n"+
 "       ___________ ||||| ____________  \n"+
 "      |           |  |  |            | \n"+
 "      | Pizzas    |     |  Uptown    |       \n"+
 "      |___________|  |  | Apartments |       \n"+
 "     |            |     |____________|__       \n"+
 "     | Johnny's                | China  |
 	   |  Theatre   |  |  | Club | Food   |  \n"+    
 "     |____________|     |_____ | _______|        \n"+  
 "      |           |  |   __________                 \n"+    
 "      |  Uptown   |     | skate    |      \n"+
 "      |  Tavern   |  |  |  shop    |      \n"+
 "      |___________      |__________|      \n"+
 "                                          \n"+
 "               #Midtown#   ";
*/
import java.util.*;
public class Uptown {

	//uptown map
	private static String upTownMap =
 "                                        \n"+	
 "        ______________________________	  \n"+
 "                  =     =               \n"+
 " #North   --  --  =     = --  --  --  #School District# \n"+
 " Beach# _________ =     =____________   \n"+
 "       ___________ ||||| ____________   \n"+
 "      |           |  |  |            |  \n"+
 "      | Pizzas    |     |  Uptown    |       \n"+
 "      |___________|  |  | Apartments |       \n"+
 "     |            |     |____________|__     \n"+
 "     | Johnny's                | China  |    \n"+
 "     |  Theatre   |  |  | Club | Food   |    \n"+    
 "     |____________|     |_____ | _______|    \n"+  
 "      |           |  |   __________          \n"+    
 "      |  Uptown   |     | skate    |      \n"+
 "      |  Tavern   |  |  |  shop    |      \n"+
 "      |___________      |__________|      \n"+
 "                                          \n"+
 "               #Midtown#                  \n";

	//uptown level
	public static void uptown(Player player){
		System.out.println(upTownMap);

	    Levels cubacleObj = new Levels(
	      "your in uptown.\n" +
	      "press \"NB\" to go to North Beach.\n" +
	      "press \"S\" to go to School District.\n",
	      "press \"MT\" to go to Midtown.\n",
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
    
    }

}