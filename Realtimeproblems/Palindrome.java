package Realtimeproblems;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        if(s.equals(s1)) System.out.println("Palindrome");
        else System.out.println("not");
    }
}
