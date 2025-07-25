package Practicesession;
import java.util.*;
public class CountHi {
    public static int count(String s){
        int count=0;
        if(s.length()<=1) return 0;
        if(s.substring(0,2).equals("hi")){
            count=1+count(s.substring(2));
        }
        else{
            count=count(s.substring(1));
        }return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(count(s));
    }
}
