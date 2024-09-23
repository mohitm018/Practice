package Main.pattern.AdditionalProblems;
import java.util.*;
public class Q5 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int N= scn.nextInt();

        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j= i;j<=N;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
