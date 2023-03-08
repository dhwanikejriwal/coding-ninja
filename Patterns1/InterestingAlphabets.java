package Patterns1;
import java.util.*;
public class InterestingAlphabets {
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            char p = (char)('A'+n-i);
            for (int j=1;j<=i;j++){
                System.out.print(p);
                p = (char)(p+1);
            }
            System.out.println();
        }
    }
}

/* input:5
   output:
          E
          DE
          CDE
          BCDE
          ABCDE
 */
