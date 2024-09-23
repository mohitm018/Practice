package Main.pattern.AdditionalProblems;

import java.util.Scanner;

public class Q1 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        for(int i =0;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=N-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
