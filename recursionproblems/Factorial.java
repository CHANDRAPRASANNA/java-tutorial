package recursionproblems;
import java.util.*;
public class Factorial {
    public long factVal(long n){
        long factorial=0;
        if(n==0||n==1) {
            factorial=1;
        }
        else {
            factorial=factVal(n-1)*n;
        }return factorial;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Factorial f=new Factorial();
        try{
        long k=sc.nextInt();
        for(int i=0;i<k;i++){
            int n=sc.nextInt();
            if(n<0) System.out.println("Negative values does not have factorial values");
            else System.out.println("factorial of "+n+" is:"+f.factVal(n)); 
        }

    }catch(Exception error){
        System.out.println("Invalid element,Enter Integer values.");
    }

}

}
