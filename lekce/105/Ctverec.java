package lekce105;

public class Ctverec extends Obdelnik {

    public static void main(String[] args) {
        Ctverec c = new Ctverec(5);
        c.setA(10);
        System.out.println(c.obsah());
    }
    public Ctverec(double a) {
        super(a, a);
    }

    @Override
    public void setA(double a) {
        super.setA(a);
        super.setB(a);
    }

    @Override
    public void setB(double b) {
        super.setB(b);
    }
}
