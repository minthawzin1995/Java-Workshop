import java.util.Arrays;

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

    /*
    Integer i1 = 127;
    Integer i2 = 127;
    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i1==i2);
    System.out.println(i3==i4);
    System.out.println(i1.equals(i2));
    System.out.println(i3.equals(i4));
    System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
    */

    System.out.println("average grades: " + test_student.getAverageGrades());
    System.out.println("average grades: " + test_student3.getAverageGrades());

    int[] studentId = new int[]{1000,1001,1002};
    char[][] grades = new char[][]{{'A','A','A','B'},{'A','A','B','B'},{'A','A','B','C'}};
    System.out.println(Arrays.toString(StudentUtil.calculateGPA(studentId, grades)));
    System.out.println(Arrays.toString(StudentUtil.getStudentsByGPA(3.2,3.5,studentId,grades)));
  }
}
