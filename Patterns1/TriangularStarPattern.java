package Patterns1;
import java.util.*;

public class TriangularStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        for (int i =1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/* Printed as : if we enter 5 there will be 5 rows
*
**
***
****
*****
 */