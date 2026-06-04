package recursion;
import java.util.*;

public class resursion2 {
 // program to calculate the powwer of a a and b;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(power(a,b));
    }   
    public static int power(int a , int b){
        if(b==1){
            return a;
        }
        return a*power(a, b-1);
    }
}
