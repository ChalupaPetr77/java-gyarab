package lekce108;

import java.util.Locale;

public class Retezec {
    public static void main(String[] args) {
        String s = "AHOJ";
//        char[] poleZnaku = s.toCharArray();
//        String zPole = new String(poleZnaku);
//        System.out.println(s.equals(zPole));
//        System.out.println(s == zPole);
        String reference = s;
        System.out.println(s == reference);
        s = s + " SVETE";
        System.out.println(s == reference);
        System.out.println(s.equals(reference));
        System.out.println(s);

        System.out.println(nKrat("Hi ", 5));

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        System.out.println(s.contains("HOJ"));
        System.out.println(s.indexOf("XOJ"));
        System.out.println(s.equals("Ahoj svete"));
        System.out.println(s.toLowerCase());
        System.out.println(s.compareTo("AHOJ SVETE")); // s > x ... s.compareTo(x) > 0
        s = s.replaceAll("E", "X");
        System.out.println(s);
    }

    public static String nKrat(String cast, int n) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append(cast);
        }
        return s.toString();
    }
}
