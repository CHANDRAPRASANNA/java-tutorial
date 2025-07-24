package Realtimeproblems;
import java.util.*;

import Basic.reverseString;
public class CharCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String s="";
        for(int i=n.length()-1;i>=0;i--){
            if(n.charAt(i)!=' ') {
                s+=n.charAt(i);
            }

            else{
                break;
            }
        }
        System.out.println(s);
        System.out.println(s.length());






        // if(n.equalsIgnoreCase(s)) System.out.println(true);
        // else System.out.println(false);
        
        // if(n.contains(s)) System.out.println(true);
        // else System.out.println(false);


    //    n.toLowerCase();
    //     System.out.println("Enter char: ");
    //     char ch=sc.next().charAt(0);
    //     int c=0;
    //     for(int i=0;i<n.length();i++){
    //         if(n.charAt(i)==ch)
    //         c+=1;
    //     }System.out.println("Count:"+c);


    }
}
