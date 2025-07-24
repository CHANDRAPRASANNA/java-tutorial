package Realtimeproblems;
import java.util.*;
public class StringOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        System.out.println(s.length());
        System.out.println(s.concat(s1));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.compareTo(s1));
        System.out.println(s.equals(s1));
    }
}
