package Main.OneDArray;
import java.util.*;
public class MaxiofArray {
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int N= scn.nextInt();
        int arr[]= new int[N];

        for(int i=0;i<N;i++){
            arr[i]=scn.nextInt();
        }
//        int maxi=0;
//        This is better and well if all the data in arr is negative

        int maxi=Integer.MIN_VALUE;

        for(int i =0;i<N;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }System.out.print(maxi);

    }
}
