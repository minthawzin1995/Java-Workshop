public class Student {
  //variable declartions

  private final int id;
  private String name;
  private static int currentId = 1000;
  String gender;

  //Constructor for student class
  public Student(String name, String gender){
    this.id = currentId;
    this.name = name;
    this.gender = gender;
    currentId++;
  }

  //method declarations
  boolean updateProfile(String newName){
    this.name = newName;
    return true;
  }

  //Get and settter method for Name
  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  //Getter method for id
  public int getId(){
    return this.id;
  }
}
