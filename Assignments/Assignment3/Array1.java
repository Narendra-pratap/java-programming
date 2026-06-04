package Assignments.Assignment3;

public class Array1 {
    public static void main(String[] args){
        int arr[]={0,2,4,1,3};
        inversion(arr);

    }
    //[0, ,1, ,3,]
    public static void inversion(int arr[]){
         int n=arr.length;
         int brr[]=new int[n];
         for(int i =0;i<n;i++){
            int j=arr[i];
            brr[j]=i;
         }
         for(int i:brr){
            System.out.print(i+" ");
         }
    }
}
