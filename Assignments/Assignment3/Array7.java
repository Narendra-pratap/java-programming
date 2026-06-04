package Assignments.Assignment3;
public class Array7 {
    public static void main(String[] args){
        int arr[]={8 ,-8, 9, -9, 10, -11, 12};
        // rotate array
        int n =arr.length;
        int temp[]=new int[n];
        
        int currTotal=0;
        int maxTotal=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            temp=arr.clone();
            rotate(temp, i);
            currTotal=maxSum(temp);
            maxTotal=Math.max(currTotal,maxTotal);


            
            
            
        }
        System.out.print(maxTotal);
    }
    public static int maxSum(int temp[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i =0;i<temp.length;i++){
            currsum+=temp[i];
            maxsum=Math.max(currsum,maxsum);
            if(currsum<0){
                currsum=0;
            }
        }
        return maxsum;
    }
    public static void rotate(int temp[],int k){
        int n =temp.length-1;
        reverse(temp, 0, n);
        reverse(temp, 0, k-1);
        reverse(temp, k, n);
    }
    public static void reverse(int temp[],int l,int h){
        while(l<h){
            int t=temp[l];
            temp[l]=temp[h];
            temp[h]=t;
            l++;
            h--;

        }
    }
   
    
    
}
