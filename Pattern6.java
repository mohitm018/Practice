package Main.pattern;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        for(int i=1;i<=N;i++){
            for(int j =1;j<=i;j++) {
                if (j % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
}
