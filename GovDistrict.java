//gov district map

//cops
//fire fighter
//hospital
//city hall
//court house
//post office

/*
"                   #School District#        \n"
"          ______________     _______ \n"      __________
"          |            |     |      |        |          |      \n"
"          |  Court     |  |  |      \______  | Hospital |          \n"
"          |  House     |     |  Police     | |          |      \n"
"		   |____________|||||||_____________| |__|  |____|			"
"                       =     =
" #Midtown#  --  --  --  =     = --  --  -- -- -- -- -- --           #Low Castles# "
"           ___________ =     =_____       _____________      \n"+ 
"          |            |||||||     |___  |             |  \n"
"          /   City     |     | Post    | | Fire        | \n"
"          \   Hall     |  |  | Office  | |  Department |      \n"
"          |___________ |     |_________| |_____________|               \n"
"                                                  \n"
"                                          \n"








*/
import java.util.*;
public class GovDistrict {

	private static String map =
	"                   #School District#        \n"+
"          ______________     _______          __________\n"+
"          |            |     |      |        |          |      \n"+
"          |  Court     |  |  |      \\______  | Hospital |          \n"+
"          |  House     |     |  Police     | |          |      \n"+
"		   |____________|||||||_____________| |__|  |____|			\n"+
"                       =     =                                      \n"+
" #Midtown# --  --  --  =     = --  --  -- -- -- -- -- --           #Low Castles# \n"+
"           ___________ =     =_____       _____________      \n"+ 
"          |            |||||||     |___  |             |  \n"+
"          /   City     |     | Post    | | Fire        | \n"+
"          \\   Hall     |  |  | Office  | |  Department |      \n"+
"          |___________ |     |_________| |_____________|               \n"+
"                                                  \n"+
"                                          ";

	public static void govDistrict(Player player){
		System.out.println(map);
		System.out.println("gov district");
	}
}