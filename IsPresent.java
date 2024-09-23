package Main.OneDArray;
import java.util.*;

public class IsPresent {
    public static boolean present(int arr[], int k){
        int N= arr.length;
        for(int i=0;i<N;i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int N= scn.nextInt();
        int  arr[]= new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scn.nextInt();
        }
        int k= scn.nextInt();
        boolean ans=present(arr,k);
        System.out.print(ans);
    }
}
