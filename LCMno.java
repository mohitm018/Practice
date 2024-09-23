package Main.Fuctions.examples;
import java.util.*;
public class LCMno {
    public static int FindGDP(int A,int B){
        while(B!=0){
            int temp=B;
            B=A%B;
            A=temp;
        }
        return A;
    }
    public static int findLCM(int A, int B){
        return (A*B)/FindGDP(A,B);
    }
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        int A= scn.nextInt();
        int B = scn.nextInt();
        int ans= findLCM(A,B);
        System.out.println(ans);
    }
}
