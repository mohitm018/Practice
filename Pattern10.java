package Main.pattern;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        int N = scn.nextInt();
        int star=N;
        int space=0;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
            star--;
            space+=2;
        }
    }
    }

