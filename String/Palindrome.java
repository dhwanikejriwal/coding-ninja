package String;

import java.util.Scanner;

public class Palindrome {


        public static boolean palindromeCheck(String str) {
            boolean result = true;
            int x = str.length();
            int i =0;
            int j = x-1;
            while (i<=x/2 && j>=x/2) {
                if (str.charAt(i) != str.charAt(j)) {
                    result = false;
                    break;
                }
                j--;
                i++;
            }
            return result;
        }
        public static void main (String args[]){

            Scanner sc = new Scanner (System.in);
            String str = sc.next();
            System.out.println(palindromeCheck(str));
        }
    }


