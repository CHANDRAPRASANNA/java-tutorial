package Practicesession;
import java.util.*;
public class pi {
    public static String replacePi(String s){
        if(s.equals("null")){
            return "Provide correct input";
        }
        if(s.length()<2){
            return s;
        }
        
        String s1="";
        String sub=s.substring(2);
        String subs=s.substring(0,2);
        if(subs.substring(0,2).equalsIgnoreCase("pi")){
            s1+="3.14";
            s1+=replacePi(sub);
        }
        else{
            s1+=s.charAt(0);
            s1+=replacePi(s.substring(1));
        }
        return s1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(replacePi(s));
    }
}
