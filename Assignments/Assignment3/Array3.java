package Assignments.Assignment3;
import java.util.*;

public class Array3 {

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m =sc.nextInt();
        System.out.print(search(arr,m));
        sc.close();

    }
    public static int search(int arr[],int m){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==m){
                return i;
            }
        }
        return -1;
    }
}

