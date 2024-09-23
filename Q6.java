package Main.pattern.AdditionalProblems;
import java.util.*;
public class Q6 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int N= scn.nextInt();

        for(int i=0;i<N;i++) {
            System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<N-1;i++){
            System.out.print("*");
            for(int j=1;j<N-i-1;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        if(N>1){
            System.out.println("*");
        }


    }
}
