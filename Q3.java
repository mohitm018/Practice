package Main.pattern.AdditionalProblems;
import java.util.*;

public class Q3 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for(int i=1;i<=N;i++){
            int numZeros=N-i;

            for(int j=0;j<numZeros;j++){
                System.out.print("0 ");
            }
            int num=N-i+1;
            for(int j=0;j<(2*i-1);j++){
                System.out.print(num+" ");
                num +=(N-i+1);
            }
            for(int j=0;j<numZeros;j++){
                System.out.print("0 ");
            }
            System.out.println();


        }
    }
}
