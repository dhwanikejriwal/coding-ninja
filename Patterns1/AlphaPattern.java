package Patterns1;
import java.util.*;

public class AlphaPattern {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {

                    System.out.print((char) ('A' + i - 1));
                }
                System.out.println();
            }
        }
    }

    /* input:3
    output:
 A
 BB
 CCC

     */
