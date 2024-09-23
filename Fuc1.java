
package Main.Fuctions;
import  java.util.*;

public class Fuc1 {
    public static int Sum2(int x, int y){
        int sum= x+y;
        return sum;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int ans= Sum2(a,b);
        System.out.print("Ans="+ans);

    }
}
