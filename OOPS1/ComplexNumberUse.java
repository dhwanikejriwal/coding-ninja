package OOPS1;
/*A ComplexNumber class contains two data members : one is the real part (R) and the other is imaginary (I) (both integers).
        Implement the Complex numbers class that contains following functions -
      1. constructor, 2. plus,3. multiply,4. print */

import java.util.*;
class ComplexNumbers{
    int real;
    int imaginary;
    public ComplexNumbers(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public void add(ComplexNumbers c2){
        this.real=this.real+c2.real;
        this.imaginary=this.imaginary+ c2.imaginary;
    }
    public void print(){
        System.out.println(real+"+"+"i"+imaginary);
    }

    public void multiply(ComplexNumbers c2){
        int real3=this.real*c2.real-this.imaginary*c2.imaginary;
        int imaginary3=this.imaginary* c2.real+ this.real* c2.imaginary;
        this.real=real3;
        this.imaginary=imaginary3;
    }

}
public class ComplexNumberUse {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int real1 = sc.nextInt();
        int imaginary1 = sc.nextInt();
        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        int real2 = sc.nextInt();
        int imaginary2 = sc.nextInt();
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);
        c1.print();
        c2.print();


        c1.multiply(c2);
        c1.print();


    }
}
