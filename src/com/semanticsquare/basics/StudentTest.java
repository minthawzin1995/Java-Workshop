public class StudentTest{
  public static void Main(String[]args){

    //creating a new student object
    Student test_student = new Student();

    //setting student state
    test_student.id = 1;
    test_student.name = "joan";
    test_student.gender = "male";

    //updatePrfile method used
    test_student.updateProfile("John");
    System.out.println(test_stuent.name);
  }
}
