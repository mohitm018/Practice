package Main.OneDArray;
import java.util.*;
public class MiniofArray {
    public static int findMini(int arr[],int N){
        int mini=arr[0];
        for(int i = 0;i<N;i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
        }
        return mini;
    }
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        int N = scn.nextInt();
        int arr[]= new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scn.nextInt();
        }

        int minimum=findMini(arr,N);
        System.out.print(minimum);

    }
}
