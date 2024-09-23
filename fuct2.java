package Main.Fuctions;
import java.util.*;
public class fuct2 {

    public  static  int mult(int x,int y){

        int multiplication= x*y;
        return multiplication;
    }
    public static int sum3(int m,int n,int p){
        int total = m+n+p;
        return total;
    }
    public static  int sumoftotal(int x){
        int sum=0;
        while(x>0){
            sum +=x%10;
            x/=10;
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b= scn.nextInt();
        int c = scn.nextInt();
        int sum1 = sumoftotal(a);
        System.out.println("Sum of all digits " +sum1);
        int sum2 = sumoftotal(b);
        System.out.println("Sum of all digits " +sum2);
        int sum3 = sumoftotal(c);
        System.out.println("Sum of all digits " +sum3);


//        int totalall= sum3(a,b,c);
//        System.out.print(totalall);

//        int ans= mult(a,b);
//        System.out.print("Multiplication = "+ans);
    }
}
