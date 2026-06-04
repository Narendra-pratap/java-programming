package Algorithm;

public class algo1 {
    // kadne's algorithm
    public static void main(String[] args){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int currentsum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            currentsum+=arr[i];
            maxSum=Math.max(currentsum,maxSum);
            if(currentsum<0){
                currentsum=0;
            }
        }
        System.out.println(maxSum);
    }
}
