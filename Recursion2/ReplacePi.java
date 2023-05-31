package Recursion2;

import java.util.Scanner;

public class ReplacePi {
    public static String replacePi(String str){
        if (str.length()<=1){
            return str;
        }

        if (str.charAt(0)=='p' && str.charAt(1)=='i'){
             String smallOutput=replacePi(str.substring(2));
             return 3.14+smallOutput;
        }
        else {
            String smallOutput = replacePi(str.substring(1));
            return str.charAt(0)+smallOutput;
        }
    }
    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        System.out.println(replacePi(str));
    }

}
