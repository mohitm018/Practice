package Main.pattern;
import java.util.*;

public class ReverseStaircase {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
//        for(int i =0;i<=N;i++){
//            for(int j=N;j>i;j--){
//                System.out.print("*");
//            }System.out.println();
//        }

//             ||  Method 2 ||
//        for(int i=1;i<=N;i++){
//            for(int j=1;j<=N-i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();

//              ||  Method 3 ||
        for(int i=1;i<=N;i++){
            for(int j=i;j<=N;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
