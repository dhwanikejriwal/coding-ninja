package Patterns1;
import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int p = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(p);
                p = p - 1;
            }
            System.out.println();
        }
    }
}

/*
input:4
output:
1
21
321
4321
 */