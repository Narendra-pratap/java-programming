package Assignments.Assignment3;
import java.util.*;

public class Array5 {
    public static void main(String[] args){
        int arr[]={5,2,6,8,4};
        int money=10;
        pairrose(arr,money);
    }
    public static void pairrose(int arr[],int money){
        Arrays.sort(arr);
        int l=0;
        int h=arr.length-1;
        int one=0;
        int two=0;
        int min=Integer.MAX_VALUE;
        while(l<h){
            int sum=arr[l]+arr[h];
            if(sum==money){
                int b=arr[h]-arr[l];
                if(b<min){
                    min=b;
                    one=arr[l];
                    two=arr[h];
                }
                l++;
                h--;
            }else if(sum>money){
                h--;
            }else{
                l++;
            }

        }
        System.out.println(one +" "+two);
    }
}
