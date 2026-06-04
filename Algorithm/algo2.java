package Algorithm;

public class algo2 {
    //reverse an array
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};//4 5 3 2 1
        int k=2;
        int l =0;
        int h=arr.length-1;
        reverse(arr, l, h);
        reverse(arr, 0, k-1);
        reverse(arr, k, h);
        for(int i :arr){
            System.out.print(i+" ");
        }
        
        
    }
    public static void reverse(int arr[],int l ,int h){
        while(l<=h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        };
    }
}
