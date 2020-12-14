package lekce105;

public class Ctverec1 {
    private double a;

    public Ctverec1(double a) {
        this.a = a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double obsah() {
        return a*a;
    }

    public double obvod() {
        return 4*a;
    }
}
