package recursionproblems;
import java.util.*;
public class fibonacci {
    public static int fibonacii(int n){
        int fib;
        if(n>2) fib=fibonacii(n-1)+fibonacii(n-2);
        else if (n==2) fib=1;

        else fib=0;
        return fib;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibonacii(n));
    }
}
