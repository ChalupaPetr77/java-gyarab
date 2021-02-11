package lekce105;

public class Obdelnik {
    private double a;
    private double b;

    public Obdelnik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double obsah() {
        return a * b;
    }

    public double obvod() {
        return 2 * (a + b);
    }
}
