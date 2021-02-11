package lekce105;

public class Ctyruhelnik2 {
    private double a;
    private double b;

    public Ctyruhelnik2(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double obsah() {
         return a * b;
    }
    
    public double obvod() {
         return 2 * (a + b);
    }
}
