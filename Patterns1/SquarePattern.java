package Patterns1;
import java.util.*;
public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}

/* Results as :
If we enter 4 , then there will be 4 rows and 4 columns
4444
4444
4444
4444
 */
