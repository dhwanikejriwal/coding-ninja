package Patterns1;
import java.util.*;
public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            char p=(char)('A'+i-1);
            for (int j=1;j<=i;j++){

                System.out.print(p);
                p=(char )(p+1);

            }
            System.out.println();
        }
    }
}

/*
input: 4
output:
A
BC
CDE
DEFG
 */

