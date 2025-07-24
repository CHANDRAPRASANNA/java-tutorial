package Realtimeproblems;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        if(s.length()!=s1.length()) return;
        char arr1[]=s.toCharArray();
        char arr2[]=s.toCharArray();
        boolean flag=false;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
            if(arr1[i]==arr2[j]) flag=true;
        }
    }
        if(flag) System.out.println("Anagram");
        else System.out.println("not an anagram");
}
}