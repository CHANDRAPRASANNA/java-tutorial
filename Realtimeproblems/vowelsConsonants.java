package Realtimeproblems;
import java.util.*;
public class vowelsConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s.toLowerCase();
        int v=0,c=0;
        char ch[]=s.toCharArray();
        char []vow={'a','e','i','o','u'};
        for(char i:ch){
            for(char j:vow){
                if(i==j) v+=1;
                if(i!=j) c+=1;
            }
            
        }
        System.out.println("Vowels: "+v+"   "+"Consonants: "+c);
    }
}
