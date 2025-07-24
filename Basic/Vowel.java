package Basic;
public class Vowel {
    public static void main(String[] args) {
        String s="Prasanna";
        char []arr={'A','E','I','O','U'};
        s.toUpperCase();
        boolean flag=true;
        for(int i=0;i<s.length()-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[i]!=s.charAt(j)){
                    flag=false;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}
