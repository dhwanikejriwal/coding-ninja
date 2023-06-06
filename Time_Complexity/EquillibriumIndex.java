package Time_Complexity;

import java.util.Scanner;

public class EquillibriumIndex {
    public static int equilibriumIndex(int arr[]){
        if(arr.length<=2){
            return -1;
        }
       int leftSum=0;
       int rightSum=0;
       for (int i=1;i<arr.length;i++){
           rightSum =rightSum+arr[i];
       }

       int i =1;
       while(i<arr.length-1){
           leftSum=arr[i-1]+leftSum;
           rightSum=rightSum-arr[i];
           if(rightSum==leftSum){
               return i;
           }
           else
               i++;
               continue;
       }
       return -1;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(equilibriumIndex(a));

}
}
