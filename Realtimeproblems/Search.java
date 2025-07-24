package Realtimeproblems;

import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        int n=sc.nextInt();
        
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Finding element:");
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                flag=true;
            }
        }System.out.println(Arrays.toString(arr));
        if(flag){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
