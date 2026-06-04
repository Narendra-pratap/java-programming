package Assignments.Assignment3;

public class Array6 {
    public static void main(String[] args){
        int arr[]={2,3};
        int brr[]={4,4,4};
        int c1=1;//single rides
        int c2=3;// multiple rides
        int c3=7;
        int c4=19;
        int rcost=0;
        for(int i =0;i<arr.length;i++){
            rcost+=Math.min(c1*arr[i],c2);
        }
        rcost=Math.min(rcost,c3);
        int ccost=0;
        for(int i =0;i<brr.length;i++){
            ccost+=Math.min(c1*brr[i],c2);
        }
        ccost=Math.min(ccost,c3);
        int totalCost=Math.min((ccost+rcost),c4);
        System.out.print(totalCost);
    }
}
