package lekce105;

public class Obdelnik1 extends Ctverec1 {
    private double b;

    public Obdelnik1(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double obvod() {
        return 2 * (getA() + b);
    }

    @Override
    public double obsah() {
        return getA() * getB();
    }
}
