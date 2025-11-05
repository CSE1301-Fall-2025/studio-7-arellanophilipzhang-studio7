public class Complex {
    private int a;
    private int b;
    public Complex(int a, int b){
        this.a = a;
        this.b = b;
    }

    public String addition(Complex z)
    {
        Complex d = new Complex(this.a + z.a, this.b + z.b);
        return toString(d);
    }

    public String multiplication(Complex z)
    {
        Complex d = new Complex(this.a*z.a - this.b*z.b, this.a*z.b + this.b*z.a);
        return toString(d);
    }

    public String toString(Complex c)
    {
        return c.a + " + " + c.b + "i";
    }

    public static void main(String[] args) {
        Complex f = new Complex(1,2);
        Complex g = new Complex(3,4);
        System.out.println(f.addition(g));
    }
}

