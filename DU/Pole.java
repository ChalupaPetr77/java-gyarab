package Ukoly.Pole;

import java.util.Arrays;

// Autor: bain

public class Pole {
    public static void main(String[] args) {
        double[] p1 = {1, 2, 3, 4, 5};
        double[] p2 = {5, 6, 7, 8, 9};
        boolean[] b = {false, true, false, true};
        System.out.println("Ukoly.UkolPole.Pole 1: " + Arrays.toString(p1));
        System.out.println("Ukoly.UkolPole.Pole 2: " + Arrays.toString(p2));
        System.out.println("Logicke pole: " + Arrays.toString(b));
        System.out.println("Soucet p1: " + soucet(p1));
        System.out.println("Aritmeticky prumer p1: " + aritmeticky_prumer(p1));
        System.out.println("Geometricky prumer p1: " + geometricky_prumer(p1));
        System.out.println("Kvadraticky prumer p1: " + kvadraticky_prumer(p1));
        System.out.println("Smerodatna odchylka p1: " + smerodatna_odchylka(p1));
        System.out.println("Vazeny prumer p1 s vahama p2: " + vazeny_prumer(p1, p2));
        System.out.println("Logicky soucin log. pole: " + logicky_soucin(b));
        System.out.println("Logicky soucet log. pole: " + logicky_soucet(b));
        System.out.println("Klon pole p1: " + Arrays.toString(klonovat_pole(p1)));
        System.out.println("Spojeni poli p1 a p2: " + Arrays.toString(spojit_pole(p1, p2)));
    }

    public static double soucet(double[] pole) {
        double s = 0;
        for (double i : pole) s += i;
        return s;
    }

    public static double aritmeticky_prumer(double[] pole) {
        return soucet(pole) / pole.length;
    }

    public static double geometricky_prumer(double[] pole) {
        double s = 1;
        for (double i : pole) s *= i;
        return Math.pow(s, 1d / pole.length);
    }

    public static double kvadraticky_prumer(double[] pole) {
        double s = 0;
        for (double i : pole) s += i * i;
        return Math.sqrt(s / pole.length);
    }

    public static double smerodatna_odchylka(double[] pole) {
        double ap = aritmeticky_prumer(pole);
        double s = 0;
        for (double i : pole) s += (i - ap) * (i - ap);
        return Math.sqrt(s / pole.length);
    }

    public static double vazeny_prumer(double[] pole, double[] vahy) {
        double s = 0;
        for (int i = 0; i < pole.length; i++) s += pole[i] * vahy[i];
        return s / soucet(vahy);
    }

    public static boolean logicky_soucin(boolean[] pole) {
        for (boolean b : pole) if (!b) return false; // zbytecne delame o jeden AND navic, ale to nevadi...
        return true;
    }

    public static boolean logicky_soucet(boolean[] pole) {
        boolean s = pole[0];
        for (boolean b : pole) s |= b; // zbytecne delame o jeden OR navic, ale to nevadi...
        return s;
    }

    public static double[] klonovat_pole(double[] pole) {
        // Tady je manuální řešení
        // double[] nove_pole = new double[pole.length];
        // for (int i = 0; i < pole.length; i++) nove_pole[i] = pole[i];
        // return nove_pole;
        return pole.clone();
    }

    public static double[] spojit_pole(double[] pole1, double[] pole2) {
        double[] spojene = new double[pole1.length + pole2.length];
        System.arraycopy(pole1, 0, spojene, 0, pole1.length);
        System.arraycopy(pole2, 0, spojene, pole1.length, pole2.length);
        return spojene;
    }
}
