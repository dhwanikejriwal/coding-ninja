package RECURSION;
import java.util.*;

public class printNumbers {
    public static void print1ton(int n){
        if (n==0){
            return;
        }
        print1ton(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        print1ton(n);
    }

}
