package RECURSION;

public class recusionFactorial {
    public static int fact(int n){
        if (n==0){
            return 1;
        }
//        if the condition of n=0 was not applied it will get stuck into infinite loop and an error occur
        int smallOutput=fact(n-1);
        int output=n*smallOutput;
        return output;
    }

    public static int sumn(int n){
        if(n==0){
            return 0;
        }
        int smallOutput=sumn(n-1);
        int output=n+smallOutput;
        return output;
    }

    public static void main (String args[]){
        System.out.println(fact(5));
        System.out.println(sumn(4));
    }
}
