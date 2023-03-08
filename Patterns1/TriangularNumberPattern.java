package Patterns1;
import java.util.*;
public class TriangularNumberPattern {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
input:4
output:
1
22
333
4444

 */
