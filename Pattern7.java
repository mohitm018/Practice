package Main.pattern;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();

    for(int i =1;i<=N;i++){
        for(int j =1;j<=N;j++){
            if(j==1 || j==N){
                System.out.print("*");
            }else{
                System.out.print("_");
            }
        }System.out.println();

//              ||Method 2||

//        for(int i=1;i<=N;i++){
//            System.out.print("*");
//
//            for(int j=1;j<=N-2;j++){
//                System.out.print("_");
//            }
//            System.out.print("*");
//            System.out.println();
    }

    }

}
