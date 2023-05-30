package RECURSION;

import java.util.Scanner;

public class LastIndex2 {
    public static int lastIndex(int input[],int x) {

        if (input.length == 0) {
            return -1;
        }
        if (input[input.length-1] == x) {
            return input.length-1;
        }
        int smallArray[] = new int[input.length - 1];
        for (int j = 1; j < input.length; j++) {
            smallArray[j] = input[j - 1];
        }
        return lastIndex(smallArray, x);
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

