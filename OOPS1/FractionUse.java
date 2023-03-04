

    package OOPS1;

//write a program to print fraction in simplest form,increment it and add to functions.

    class Fraction {
        private int numerator ;
        private int denominator;

        public Fraction(int numerator, int denominator)
        {
            this.numerator=numerator;
            this.denominator=denominator;
            simplify();
        }

        private void simplify() {
            int gcd=1;
            int smaller = Math.min(numerator,denominator);
            for(int i =1;i<=smaller;i++){
                if(numerator%i==0 && denominator%i==0){
                    gcd=i;
                }
            }
            numerator=numerator/gcd;
            denominator=denominator/gcd;
        }

        public void increment(){
            numerator=numerator+denominator;
            simplify();
        }

        public void print(){
            System.out.println(numerator+"/"+denominator);
        }
        public void addFraction(Fraction f2){
            //on first fraction function is called
            //second fraction is passed as parameter

            this.numerator=this.numerator* f2.denominator+ f2.numerator*this.denominator;
            this.denominator=this.denominator*f2.denominator;
            simplify();

        }



    }
    public class FractionUse {
        public static void main(String args[]) {
            Fraction f1 = new Fraction(4, 9);
            Fraction f2 = new Fraction(3, 6);
            f1.print(); f2.print();
            f1.addFraction(f2);
            f1.print();


        }
    }


