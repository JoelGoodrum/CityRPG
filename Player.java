import java.util.*;

//responsible for keeping track of player items and other info
public class Player {

  //player vals
  private int health;
  private String[] items;
  private String[] commands;


  //make player obj
  public Player(){
    health = 100;
    items = new String[5]; //five is how many items player can keep

    //constant commands
    commands = new String[3];
    commands[0] = "health";
    commands[1] = "items";
    commands[2] = "exit";
    
  }


  //show health
  public String showHealth(){
    return "health: " + this.health;
  }


  //see if there are items
  public boolean isEmptyItems(){

    for(int i = 0; i < this.items.length; i++) {
      if(this.items[i] != null) {
        return true;
      }
    }

    return false;
  }


  //show items
  public String showItems(){
    
    if(isEmptyItems() == false) {
      return "you have no items.";
    }

    else {
      String itemString = "items: ";
      for(int i = 0; i < this.items.length; i++) {
        if(this.items[i] != null) {
          itemString += items[i] + " ";
        }
      }
      return itemString;
    }

  }
  

  //add items
  public void addItem(String playerItem) {

    int bagSize = 0;
    int newItemIndex = 0;

    for(int i = 0; i < this.items.length; i++) {

        if(this.items[i] != null) {
          bagSize++;
        } 
        
        else {
          //this is to find a place to add an item
          newItemIndex = i;
        }

    }
    

    //if theres space in the bag, add item
    if(bagSize < 5) {
      items[newItemIndex] =  playerItem; 
      System.out.println(playerItem + " obtained.");
    }

    //notify bag is full
    else {
      System.out.println("bag is full.");
    }

  }


  //show commands
  public void showCommands(){
    for(int i = 0; i < commands.length; i++){
      System.out.print(commands[i] + ", ");
    }
  }

  //see if input is a constant command
  public String commandInput(String input){

    if(input.equals("health")){
        return this.showHealth() + "\n";
      }

    if(input.equals("items")){
      return this.showItems() + "\n";
    }

    else {
      return "";
    }
  }

  //see if player has item
  public boolean hasItem(String var){
    for(int i = 0; i < items.length; i++){
      if(items[i] == var) {
        return true;
      }
    }
    return false;
  }

}