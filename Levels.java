//make level objects
public class Levels {

  //level variales
  private String description;
  private String commands;
  private String object;

  //level constructor
  public Levels(String description, String commands){
    this.description = description;
    this.commands = commands;
  }
  
  //show level description
  public void showDescription(){
    System.out.print(this.description);
    System.out.print(this.commands);
  }

}