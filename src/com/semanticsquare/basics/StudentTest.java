public class StudentTest{
  public static void main(String[] args){

    //creating a new student object
    Student test_student = new Student("Joan", "male");
    Student test_student2 = new Student("Mike", "male");

    //updateProfile method used
    test_student.updateProfile("John");

    System.out.println(test_student2.getName() + " " + test_student.getId());
    System.out.println(test_student.getName() + " " + test_student.getId());
  }
}
