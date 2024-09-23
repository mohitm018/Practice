package Main.Fuctions.examples;
import java.util.*;
public class PowerExmp {
    public static int power(int A,int B) {
        long result = 1;
        for (int i = 0; i < B; i++) {
            result *= A;
            if (result > 1000000000) {
                return 0;
            }
        }
        return (int) result;

    }
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int A= scn.nextInt();
        int B = scn.nextInt();

        int ans= power(A,B);
        System.out.println(ans);
    }
}
