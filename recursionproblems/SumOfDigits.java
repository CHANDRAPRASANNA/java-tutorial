package recursionproblems;
import java.util.*;
public class SumOfDigits {
    public static int Sum(int n){
        int sum=0;
        if(n>0){
        int rem=n%10;
        n=n/10;
        sum=Sum(n)+rem;
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Sum(n));
    }
}
