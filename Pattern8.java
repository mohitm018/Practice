package Main.pattern;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int N=  scn.nextInt();
//        for(int i =1;i<=N;i++){
//            System.out.print("*");
//            for(int j=1;j<=N-i;j++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            System.out.println();
        int numspace =N-1;
        for(int i=1;i<=N;i++){
            System.out.print("*");
            for(int j=1;j<=numspace;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            numspace--;
        }
    }
}
