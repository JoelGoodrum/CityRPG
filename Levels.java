//make level objects
public class Levels {

  //level variales
  String description;
  String commands;
  String object;

  //level constructor
  public Levels(String description, String commands){
    this.description = description;
    this.commands = commands;
  }
  
  //show level description
  public void showDescription(){
    System.out.println(this.description);
  }

}