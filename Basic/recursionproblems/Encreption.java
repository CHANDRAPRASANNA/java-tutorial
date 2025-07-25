package recursionproblems;
import java.util.*;
//Enccrption by shift 2 alphabets
public class Encreption {
    public static String encreption(String s,int n){
        String s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                s1+=' ';
            }else{
            int k=(int)(s.charAt(i))+n;
            if(k>90){
                k=k%90+64;
            }
            s1+=(char)k;
            }
        }return s1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        s.toUpperCase();
        System.out.println(encreption(s,n));
    }
}
