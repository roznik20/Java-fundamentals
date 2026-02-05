import java.util.Arrays;
import java.util.Random;
public class doubleDimArr{
    public static void main(){
        int arr[][] = new int[3][];
        System.out.println(Arrays.toString(arr));

        int[] x = {1,2,3};
        int[] y = x;
        y[0] = 4;
        System.out.println(x[0] + " " + y[0]);

        Random randInt = new Random();
        int bone = randInt.nextInt(6) + 1;
        System.out.println(bone);


    }
}