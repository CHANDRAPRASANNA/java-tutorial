package Realtimeproblems;
import java.util.*;
import java.util.Scanner;

public class LogestWord {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        String str=arr[0];
        for(String i:arr){
            if(i.length()>str.length()){
                str=i;
            }
        }System.out.println(str);
}
}
