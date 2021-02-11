package lekce105;

public class Cteverec2 extends Ctyruhelnik2 {
    public static void main(String[] args) {
        Cteverec2 c = new Cteverec2(5);
        System.out.println(c.obsah());
    }
    public Cteverec2(double a) {
        super(a, a);
    }
}
