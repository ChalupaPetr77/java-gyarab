package Ukoly.StatZnak;

import java.util.Arrays;
import java.util.Scanner;

public class StatistikaZnakuK {
    public static void main(String[] args) {
        StatistikaZnakuK stat = new StatistikaZnakuK();
        stat.zpracuj("nejaky text - prvni radek 123");
        stat.zpracuj("jiny text - \n\n\rdruhy radek 999");
        System.out.println("Pocet cislic: " + stat.getPocetCislic());
        System.out.println("Pocet radku: " + stat.getPocetRadku());
        stat.vynuluj();
        stat.zpracuj("jeden radek");
        System.out.println("Pocet radku: " + stat.getPocetRadku());
        stat.vynuluj();
    }

    private int pocetRadku;
    private int pocetCislic;
    //...
    private int[] cetnost = new int[Character.MAX_VALUE + 1];

    public void zpracuj(String s) {
        Scanner sc = new Scanner(s);
        while (sc.hasNextLine()) {
            String radek = sc.nextLine();
            for (int i = 0; i < radek.length(); i++) {
                char c = radek.charAt(i);
                if (Character.isDigit(c)) {
                    pocetCislic++;
                }
                //...
                cetnost[c]++;
            }
            pocetRadku++;
        }
    }

    public void vynuluj() {
        pocetRadku = 0;
        pocetCislic = 0;
        //...
        Arrays.fill(cetnost, 0);
    }

    public char nejcetnejsiZnak() {
        char maxCetnost = 0;
        for (int c = Character.MIN_VALUE+1; c <= Character.MAX_VALUE; c++) {
            if (cetnost[c] > cetnost[maxCetnost]) {
                maxCetnost = (char) c;
            }
        }
        return maxCetnost;
    }

    public int getPocetRadku() {
        return pocetRadku;
    }

    public int getPocetCislic() {
        return pocetCislic;
    }
}
