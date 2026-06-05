package striverdsasheet.Array;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        int n =sc.nextInt();
        int k =sc.nextInt();
        int arr[]=new int[n];
        

        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rotate(arr,k);
    }
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        for(int i =1;i<=k;i++){
            Rotate(nums,nums[n-1]);

        }
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
    public static void Rotate(int arr[],int picked){
        int n =arr.length-1;
        for(int i=0;i<n;i++){
            arr[n-i]=arr[n-1-i];
        }
        arr[0]=picked;
     
    }
}
