package Practicesession;
import java.util.*;
public class Change{
    public static String replaceX(String s){
        String s1="";
        String sub=s.substring(1);
        String subs=s.substring(0,1);
        if(s.equals("null")){
            return "Provide correct input";
        }
        if(s.length()==1){
            if(s.equalsIgnoreCase("x")) return "y";
        }
        if(subs.substring(0,1).equalsIgnoreCase("x")){
            s1+="y";
            s1+=replaceX(sub);
        }
        else{
            s1+=s.charAt(0);
            s1+=replaceX(s.substring(1));
        }
        return s1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(replaceX(s));
    }
}
