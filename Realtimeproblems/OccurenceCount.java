package Realtimeproblems;
import java.util.*;
public class OccurenceCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }System.out.println(Arrays.toString(arr));
        System.out.println("Enter element to count occurances:");
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==k)
            c+=1;
        }System.out.println("Occurances:"+c);
    }
}
