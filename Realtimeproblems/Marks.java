package Realtimeproblems;
import java.util.*;
public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=12;
        int arr[]=new int[12];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
