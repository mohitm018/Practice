package Main.OneDArray;
import java.util.*;
public class Frequency {
    public static int findFreq(int  arr[], int k){
        int N= arr.length;
        int freq=0;
        for(int i=0;i<N;i++){
            if(arr[i]==k){
                freq++;
            }
        }
        return freq;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int N=scn.nextInt();
        int arr[]= new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scn.nextInt();
        }
        int k= scn.nextInt();
        int ans= findFreq(arr,k);
        System.out.print(ans);
    }
}
