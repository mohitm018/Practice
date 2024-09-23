package Main.Fuctions.examples;
import java.util.*;
public class FavCol {
    public static int Fav(int A,int B,int C){
        int max =A/B;
        return Math.min(max,C);
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int A= scn.nextInt();
        int B= scn.nextInt();
        int C = scn.nextInt();
        int Sol= Fav(A,B,C);
        System.out.println(Sol);

    }
}
