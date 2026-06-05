package striverdsasheet.Array;
import java.util.*;

public class Array2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=findSecondLargest(arr);
        System.out.print(result);
        sc.close();

    }
    public static int findSecondLargest(int arr[]){
        int result=findLargest(arr);
        for(int i =0;i<arr.length;i++){
            if(arr[i]==result){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        return findLargest(arr);
    }
    public static int findLargest(int arr[]){
         int max=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
