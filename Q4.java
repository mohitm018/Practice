package Main.pattern.AdditionalProblems;
import java.util.*;

public class Q4 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=N-1;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
