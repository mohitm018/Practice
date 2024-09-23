package Main.Fuctions;
import java.util.*;
public class isPrime {
    public static void printAllPrime(int n) {
        for (int i = 1; i <=n; i++) {
            if (isPrime(i) == true)
                System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int n) {
        int cnt = noOfFactors(n);
        if (cnt == 2)
            return true;
        else return false;
    }

    public static int noOfFactors(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0)
                cnt++;

        }
        return cnt;
    }


        public static void main (String[]args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
//            System.out.print(printAllPrime(n));
            printAllPrime(n);
        }
    }

