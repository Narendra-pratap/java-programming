package recursion;
import java.util.Scanner;

public class recursion1 {
    // calculate the factorial of a number n 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(); 
        int result=factorial(n);
        System.out.print(result);
        sc.close();


    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return n;
        }
        return n* factorial(n-1);
    }
}
