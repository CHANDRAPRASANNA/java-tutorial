package Practicesession;
import java.util.*;
public class Endx {
    public static String endx(String s){
        if(s.length()<1) return null;
        if(s.length()==1)return s;
        String s1="";
        String sub=s.substring(0,1);
        String ss=s.substring(1);
        if(sub.equals("x")){
            s1+=endx(ss)+sub;
        }
        else{
            s1+=sub+endx(ss.substring(0));
        }return s1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(endx(s));
    }
}
