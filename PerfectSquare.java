package Main.Fuctions.examples;
import java.util.*;
public class PerfectSquare {
    public static int isPerfect(int A){
        int sqrt= (int) Math.sqrt(A);
        if(sqrt*sqrt==A){
            return 1;
        }
        else return 0;
    }
    public static void main(String []args){
        Scanner  scn = new Scanner (System.in);
        int A= scn.nextInt();
        int ans= isPerfect(A);
        System.out.println(ans);

    }
}
