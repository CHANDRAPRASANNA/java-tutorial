package Realtimeproblems;

// public class Tras {
//     public static void main(String[] args) {
        // String str[]=new String[5];
        // for(String s:str) System.out.println(s+" ");
        // System.out.println();

        // int num[]=new int[5];
        // for(int v:num) System.out.println(v+" ");
        // System.out.println();

        // double dnum[]=new double[5];
        // for(double s:dnum) System.out.println(s+" ");
        // System.out.println();

        // boolean b[]=new boolean[5];
        // for(boolean s:b) System.out.println(s+" ");
        // System.out.println();


    //     int s1=sum(new int[] {1,2,3,4,5});
    //     System.out.println(s1);
    // }
    //     public static int sum(int a[]){
    //         int total=0;
    //         for(int i:a){
    //             total+=i;
    //         }
    //         return total;


    import java.util.*;
    public class Tras {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][]arr=new int[4][4];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                 arr[i][j]=sc.nextInt();
            }
           
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                 System.out.print(arr[i][j]+" ");
            }System.out.println();
           
        }
        }
    }

