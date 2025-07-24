package Realtimeproblems;
import java.util.*;
public class Devil {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String arr[]=s.split("[@$]");
        int max=0;
        for(String i:arr){
            if(i.length()>max) {
                max=i.length();
            }
        }System.out.println("groups: "+arr.length);
            System.out.println(max+1);
        
    }
}
