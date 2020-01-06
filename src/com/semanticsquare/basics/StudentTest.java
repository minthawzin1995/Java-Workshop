public class StudentTest{
  public static void main(String[] args){

    //creating a new student object
    char[] grades_1 = {'A','A','A','B'};
    char[] grades_2 = {'A','A','B','B'};
    char[] grades_3 = {'B','A','B','B'};


    Student test_student = new Student("Joan", "male", grades_1);
    Student test_student2 = new Student("Mike", "male",grades_2);
    Student test_student3 = new Student("Mia", "female",grades_3);


    //updateProfile method used
    test_student.updateProfile("John");

    System.out.println(test_student.getName() + " " + test_student.getId());
    System.out.println(test_student2.getName() + " " + test_student2.getId());
    System.out.println(test_student3.getName() + " " + test_student3.getId());


    //number of students
    System.out.println("number of students: " + Student.getStudentCount());
  }
}
