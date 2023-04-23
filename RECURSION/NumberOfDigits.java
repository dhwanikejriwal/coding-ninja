package RECURSION;
import java.util.*;
public class NumberOfDigits{
    public static int count(int n){
        int count=0;
        if(n/10==0){
            return 1;
        }
        int smallOutput=count(n/10);
        int output=1+smallOutput;
        return output;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
}
