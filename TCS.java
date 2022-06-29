package mylearningg;

import java.util.Scanner;

public class TCS {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int d= sc.nextInt();
        int x= sc.nextInt();
        pollution(arr,d,x);

    }

    public static void pollution(int[] arr,int d, int x){
       int temp=0;
       int sum=0;
       for(int i=0;i<arr.length;i++) {
           if (d % 2 == 0) {
               if (arr[i] % 2 != 0) {
                   sum += x;
               }
           }else {
               if (arr[i] % 2 == 0) {
                   sum += x;
               }
           }
       }
        System.out.println(sum);
    }
}
