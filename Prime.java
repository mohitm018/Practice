package Main.Fuctions.examples;
import java.util.*;
public class Prime {
    public static int  solve(int n){
        if(n<2){
            return 0;
        }
        int count =0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return   false;
        }
        for(int i=2;i*i<=num;i++){
            if(num %i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans= solve(n);
        System.out.println(ans);

    }

}
