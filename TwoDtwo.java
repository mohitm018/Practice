package Main.TwoDArray;

import java.util.Scanner;

public class TwoDtwo {
    public static void PrintTopRow(int[][]mat){
        int n = mat.length;
        int m= mat[0].length;
        for(int i=0;i<m;i++){
            System.out.print(mat[0][i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        PrintTopRow(mat);
    }
}
