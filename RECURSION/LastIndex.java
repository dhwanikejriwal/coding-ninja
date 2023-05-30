/*Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
        Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
        You should start traversing your array from 0, not from (N - 1).
        Do this recursively. Indexing in the array starts from 0.
        Input Format :
        Line 1 : An Integer N i.e. size of array
        Line 2 : N integers which are elements of the array, separated by spaces
        Line 3 : Integer x
        Output Format :
        last index or -1
        Constraints :
        1 <= N <= 10^3
        Sample Input :
        4
        9 8 10 8
        8
        Sample Output :
        3  */

package RECURSION;
import java.util.*;
public class LastIndex {
    public static int lastIndex(int input[],int x, int ei){
        if(ei==0){
            return -1;
        }
        if(input[ei]==x){
            return  ei;
        }
        return lastIndex(input,x,ei-1);
    }
    public static int lastIndex(int input[] , int x){
        return lastIndex(input,x,input.length-1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println(lastIndex(arr,x));
    }
}
