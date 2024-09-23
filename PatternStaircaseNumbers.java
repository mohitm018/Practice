package Main.pattern;

import java.util.Scanner;

public class PatternStaircaseNumbers {
    public static void main(String[]args){
        Scanner scn =  new Scanner(System.in);
        int N = scn.nextInt();
        for(int i= 1;i<=N;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
