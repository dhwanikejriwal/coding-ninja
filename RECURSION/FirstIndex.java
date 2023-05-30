package RECURSION;
import java.util.*;

public class FirstIndex {
    public static int firstIndex(int input[],int x,int si){
        if(si==input.length)
            return -1;
        if(input[si]==x)
            return si;
        return firstIndex(input,x,si+1);
    }
    public static int firstIndex(int input[],int x ){
        return firstIndex(input,x,0);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(firstIndex(a,x));
    }
}
