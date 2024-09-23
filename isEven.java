package Main.Fuctions;
import java.util.*;
public class isEven {
    public static boolean isevenn0(int x){

//        if (x%2==0)
//                return true;
//        else
//            return  false;

        return x%2==0;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n =  scn.nextInt();
        System.out.println(isevenn0(n));
    }

}
