package Realtimeproblems;
import java.util.*;
public class WhiteSpaceRemove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str="";
        String arr[]=s.split(" ");
        for(String i:arr){
            str+=i;
        }
        System.out.println(str);
    }
}
