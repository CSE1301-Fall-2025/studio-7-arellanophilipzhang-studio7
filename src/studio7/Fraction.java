public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction (int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public int getNumerator(Fraction b){
        return this.numerator * b.denominator + this.denominator * b.numerator;
    }

    public int getDenominator(Fraction b){
        return this.denominator * b.denominator;
    }

    public String addition(Fraction b){
        Fraction c = new Fraction(this.getNumerator(b), this.getDenominator(b));
        return toString(c);
    }

    public String reciprocal(){
        Fraction c = new Fraction(this.denominator, this.numerator);
        return toString(c);
    }

    public String multiplication(Fraction b){
        Fraction c = new Fraction (this.numerator * b.numerator, this.denominator * b.denominator);
        return toString(c);
    }

    public String toString(Fraction c){
        return c.numerator + "/" + c.denominator;
    }

    public static void main(String[] args) {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);
        System.out.println(a.addition(b));
        System.out.println(a.reciprocal());
        System.out.println(a.multiplication(b));
    }

}
