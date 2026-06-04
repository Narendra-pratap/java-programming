package Assignments.Assignment3;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args){
        int arr[]={5 ,7 ,9 ,1 ,2 ,4 ,6 ,8 ,3};
        //{1,2,3,4,5,6,7,8,9}
        int target=10;
        allPairTriplet(arr,target);

    }
                                // approach-2
public static void allPairTriplet(int arr[],int target){
    Arrays.sort(arr);
    for(int i =0;i<arr.length;i++){
        int l=i+1;
        int h=arr.length-1;
        while(l<h){
            int sum=arr[i]+arr[l]+arr[h];
            if(sum==target){
               System.out.println(arr[i] + " " + arr[l] + " and " + arr[h]);
                l++;
                h--;
               
            }else if(sum>target){
                h--;
            }else{
                l++;
            }
          
          
        }
         
    }

}






//                              Approach -1

    public static void  allPairTriplets(int arr[],int target){
         // aproach -1 three for loops
         Arrays.sort(arr);
         int n =arr.length;
         for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k =j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        
                        
                        System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
                       
                    }
                    
                }
                
            }
         }
    }
}
