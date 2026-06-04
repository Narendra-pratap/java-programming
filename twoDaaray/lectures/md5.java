package twoDaaray.lectures;

public class md5 {
    // program to print matrix in spiral form
    public static void main(String[] args){
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
            {17,18,19,20}
        };
        
        int rs=0;
        int re=arr.length-1;
        int cs=0;
        int ce=arr[0].length-1;
        
        int num=0;
        int total=arr.length * arr[0].length;
        while(num<total){
            for(int i =cs;i<=ce && num<total;i++){
            System.out.print(arr[rs][i]+" ");
            num++;
        }
        rs++;
        for(int i =rs;i<=re && num<total;i++){
            System.out.print(arr[i][ce]+" ");
            num++;
        }
        ce--;
        for(int i =ce;i>=cs && num<total;i--){
            System.out.print(arr[re][i]+" ");
            num++;
        }
        re--;
        for(int i =re;i>=rs && num<total;i--){
            System.out.print(arr[i][cs]+" ");
            num++;
        }
        cs++;
        }
        
   
    }
}
