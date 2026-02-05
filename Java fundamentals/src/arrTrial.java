import java.util.Arrays;
import annoy.bibaNboba;

public class arrTrial{
    public static void main (){
        String[] daybreak = {"monday","wensder","Tuesday Thursday duality"};
        System.out.println(daybreak[2]); 
        
        int numy = 7;
        String[] dayFloat;
        dayFloat = new String[numy];
        dayFloat[0] = "mirror";
        dayFloat[3] = "drum";
        System.out.println(Arrays.toString(dayFloat));

        int[] grades = {90, 85, 78, 92, 88};
        int[] gradesOne = {90, 85, 78, 92, 88};
        boolean equality = Arrays.equals(grades, gradesOne);
        System.out.println(equality);
        double average = gradeAvg(grades);
        System.out.println("The average grade is: " + average);

        String plant = bibaNboba.mess();
        System.out.println(plant);
    }

    public static double gradeAvg(int[] grades){
        double sum = 0;
        int studentNum = grades.length;
        for (int i = 0; i< studentNum; i++){
            sum += grades[i];
        }
        
        return sum/studentNum;
    }
}