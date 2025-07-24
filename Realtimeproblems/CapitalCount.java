package Realtimeproblems;
import java.util.*;
public class CapitalCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(0)==' ') c=1;
            if(s.charAt(i)==' '){
                if(s.charAt(i+1)<='Z' && s.charAt(i+1)>='A' ){
                    c+=1;
                }
            }
        }System.out.println(c);
    }
}
