package Recursion2;

import java.util.Scanner;

public class RemoveCharString {
    public static String removeX (String input){
        if(input.length()==0){
            return input;
        }
        if (input.length()==1){
            if(input.charAt(0)=='x')
               return "";
            else
                return input;
        }
        String smallOutput= removeX(input.substring(1));
        if(input.charAt(0)=='x'){
            return smallOutput;
        }
        else
            return input.charAt(0)+smallOutput;
    }
    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        System.out.println(removeX(str));
    }

}
