package RECURSION;

import java.util.Scanner;

public class FibonacciSeries {
    public static int fib(int n){
        if (n==1 || n==0){
            return n;
        }
        int fib_n_1=fib(n-1);
        int fib_n_2=fib(n-2);
        int output=fib_n_1+fib_n_2;
        return output;
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(fib(n));
    }

}
