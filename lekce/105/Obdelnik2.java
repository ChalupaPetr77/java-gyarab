package lekce105;

public class Obdelnik2 extends Ctyruhelnik2 {

    public static void main(String[] args) {
        Obdelnik2 o = new Obdelnik2(3, 5);
        System.out.println(o.obsah());
    }

    public Obdelnik2(double a, double b) {
        super(a, b);
    }
}
