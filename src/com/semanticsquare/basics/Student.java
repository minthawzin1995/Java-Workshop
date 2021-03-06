public class Student {
  //variable declartions

  private int id;
  private String name;
  public static int currentId = 1000;
  private char[] grades;
  private static int studentCount;
  String gender;

  //Constructor for student class
  public Student(String name, String gender, char[] grades){
    this.name = name;
    this.gender = gender;
    this.grades = grades;
    currentId = currentId + 1;
    this.id = currentId;
    studentCount ++;
  }

  public char[] getGrades(){
    return this.grades;
  }

  public double getAverageGrades() {
    double totalValue = 0.0;
    for(char c: this.grades){
      if(c == 'A'){
        totalValue += 4;
      }
      else if(c == 'B'){
        totalValue += 3;
      }
      else{
        totalValue += 2;
      }
    }
    double avgGrade = totalValue/this.grades.length;

    return avgGrade;
  }

  public static int getStudentCount(){
    return studentCount;
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
