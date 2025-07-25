// package recursionproblems;
// import java.util.*;
// public class CountOfZerosUsingRecursion {
//     public static int numberOfZeros(int n){
//         int zeroC=0;
//         if(n==0) zeroC=1;
//         else if(n<10) zeroC=0;
//         else if (n%10==0 ) zeroC=numberOfZeros(n/10)+1;
//         else zeroC=numberOfZeros(n/10);
//         return zeroC;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println(numberOfZeros(n));

//     }
// }


package recursionproblems;
import java.util.*;
public class CountOfZeros {
    public static int numberOfZeros(int n){
        int zeroC=0;
        if(n<10) {
            zeroC=0;
        }
        else if (n==0){ 
            zeroC=1;
        }
        else{
        while(n!=0){
            int rem=n%10;
            if(rem==0) zeroC+=1;
            n/=10;
        } 
    }
        return zeroC;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(numberOfZeros(n));
        
    }
}