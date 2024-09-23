package Main.Fuctions.examples;
import java.util.*;
public class HCF {
    public static int HCFno(int A,int B){
        while(B != 0){
            int temp =B;
            B= A%B;
            A= temp;
        }
        return A;
    }
    public  static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B= scn.nextInt();
        int ans= HCFno(A,B);
        System.out.println(ans);
    }
}
