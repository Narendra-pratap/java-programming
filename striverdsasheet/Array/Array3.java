package striverdsasheet.Array;
import java.util.*;

public class Array3 {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(check(arr));
        sc.close();

    }
    public static Boolean check(int nums[]){
         int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                count++;
            }

        }
        return count<=1;
    }
}
