import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentUtil {

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {

        double[] avgGrades = new double[studentIdList.length];
        for(int i = 0; i <studentIdList.length; i++){
          double totalGrades = 0.0;
          for(int j = 0; j < studentsGrades[i].length; j++){
            if(studentsGrades[i][j] == 'A'){
              totalGrades += 4.0;
            }else if(studentsGrades[i][j] == 'B'){
              totalGrades += 3.0;
            }else{
              totalGrades += 2.0;
            }
            avgGrades[i] = totalGrades/studentsGrades[i].length;
          }
        }
        return avgGrades;
    }

    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        // perform parameter validation. Return null if passed parameters are not valid

        if(lower > higher){
          return null;
        }
        if(lower < 0 || higher < 0){
          return null;
        }
        double [] avgGpa = new double[studentIdList.length];
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i:studentIdList) {
          list2.add(i);
        }
        avgGpa =calculateGPA(studentIdList, studentsGrades);

        for(int i =0; i< studentIdList.length; i++){
          if(avgGpa[i] < lower || avgGpa[i] > higher){
            list2.remove(Integer.valueOf(studentIdList[i]));
          }
        }

        return toIntArray(list2);
        // invoke calculateGPA

        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array
    }

    public static int[] toIntArray(List<Integer> list){
      int[] ret = new int[list.size()];
      for(int i = 0;i < ret.length;i++)
        ret[i] = list.get(i);
      return ret;
}
}
