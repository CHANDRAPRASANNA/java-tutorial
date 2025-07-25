package Practicesession;
import java.util.*;
public class RemoveDup {
    public static String dup(String s){
        if(s.length()<1) return "null";
        if(s.length()==1) return s;
        String ch=s.substring(0,1);
        String s1=s.substring(1,2);
        if(ch.equals(s1)){
            return ch+dup(s.substring(3));
        }else{
            return ch+dup(s.substring(1));
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(dup(s));
    }
}
