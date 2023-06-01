package Recursion2;

import java.util.Scanner;

public class BinarySearchRecursion {
    public static int binarySearch(int a[],int si,int ei,int x){
        if(si>ei)
            return -1;
        int midIndex= (si+ei)/2;
        if(a[midIndex]==x)
            return midIndex;
        else if(a[midIndex]<x){
            return binarySearch(a,midIndex+1,ei,x);
        }
        else if(a[midIndex]>x){
          return binarySearch(a,si,midIndex-1,x);
        }
        return 1;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(binarySearch(a,0,a.length,x));
    }
}
