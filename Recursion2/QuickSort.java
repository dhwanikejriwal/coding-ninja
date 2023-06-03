package Recursion2;

import java.util.Scanner;

public class QuickSort {
    public static int partition(int input[],int si,int ei){
        int pivotElement =input[si];
        int count=0;
        for (int i = si + 1; i <= ei; i++) {
            if (input[i] <pivotElement)
                count++;
        }
        int temp=input[si+count];
        input[si+count]=pivotElement;
        input[si]=temp;

        int i =si;
        int j =ei;
        while(i<j){
            if(input[i]<pivotElement){
                i++;
            }
            else if(input[j]>=pivotElement){
                j--;
            }
            else{
                int x=input[i];
                input[i]=input[j];
                input[j]=x;
                i++;
                j--;
            }
        }
        return si+count;
    }
    public static void quickSort(int input[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        int pivotIndex=partition(input,si,ei);
        quickSort(input,si,pivotIndex-1);
        quickSort(input,pivotIndex+1,ei);
        }
    public static void quickSort(int input[]) {
        quickSort(input, 0, input.length-1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        quickSort(a);
        for(int i =0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
