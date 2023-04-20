package exceptions;

public class Exception1 {

        public static int divide(int a ,int b){
            if(b==0) throw new ArithmeticException();
            return a/b;
        }
        public static void main (String args[]){
            divide(10,0);
        }
}
