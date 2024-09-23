package Main.pattern;

import java.util.Scanner;

public class PatternRectangle {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int N= scn.nextInt();
        int M = scn.nextInt();

        for(int i =0;i<N;i++){
            for(int j= 0;j<M;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
