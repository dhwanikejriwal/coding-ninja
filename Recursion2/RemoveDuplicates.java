package Recursion2;

import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeConsecutiveDuplicates(String s) {
     if(s.length()<=1){
        return s;
    }
    String smallOutput=removeConsecutiveDuplicates(s.substring(1));
		 if(s.charAt(0)==s.charAt(1))
    {
        return smallOutput;
    }
		 else
                 return s.charAt(0)+smallOutput;
   }


    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(removeConsecutiveDuplicates(str));

    }
}

