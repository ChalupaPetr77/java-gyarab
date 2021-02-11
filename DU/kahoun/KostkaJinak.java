package Kostka;

import cz.gyarab.util.Utils;
import cz.gyarab.util.light.Matrix;

public class Kostka {

    private int cislo; // zobrazovana strana
    private final Matrix pole; // matrix

    public static void main(String[] args) {
        Kostka kostka = new Kostka();
        while (true) {
            for (int i = 1; i < 10; i++) {
                kostka.setCislo(i);
                Utils.sleep(999);
            }
        }
    }

    public Kostka() {
        // bezparametrický konstruktor
        this.pole = Matrix.createMatrix(7, 7);
        this.cislo = 1;
        this.pole.showWindow();
        render();
    }

    public Kostka(int cislo) {
        // konstruktor s přednastavenou hodnotou
        this.pole = Matrix.createMatrix(7, 7);
        this.cislo = cislo;
        this.pole.showWindow();
        render();
    }

    public int getCislo() {
        // getter
        return cislo;
    }

    public void setCislo(int cislo) {
        // setter
        this.cislo = cislo;
        this.render();
    }

    private void render() {
        int mapa = 0;

        // šlo by to udělat polem a třeba i pomocí map,
        // ale takhle nepoužívám nic, co jsme se neučili
        // Jednotlivé bity slouží k označení místa jako vyplý, nebo zaplý.
        // Například pro 1 by měla mapa být 0b1000000000000
        // Což je v překladu:
        // 00000
        // 00000
        // 00100
        // 00000
        // 00000
        // Nepotřebuji vypisovat všechny nuly, protože ty jsou přidány automaticky.
        switch (cislo) {
            case 1:
                mapa = 0b1000000000000;
                break;
            case 2:
                mapa = 0b100000000000000010000;
                break;
            case 3:
                mapa = 0b100000001000000010000;
                break;
            case 4:
                mapa = 0b1000100000000000000010001;
                break;
            case 5:
                mapa = 0b1000100000001000000010001;
                break;
            case 6:
                mapa = 0b1000100000100010000010001;
                break;
            case 7:
                mapa = 0b1000100000100010000010101;
                break;
            case 8:
                mapa = 0b1010100000100010000010101;
                break;
            case 9:
                mapa = 0b1010100000101010000010101;
                break;
        }

        // Pomocí map mi stačí jen dva for loopy.
        for (int radek = 0; radek < pole.getHeight() - 2; radek++) {
            for (int sloupec = 0; sloupec < pole.getWidth() - 2; sloupec++) {
                // setOnOff je metoda, která dokáže vypnout nebo zapnout světlo podle toho, jestli třetí parametr (on)
                // je True, nebo False.
                // Pro každý políčko posuneme mapu o tolik bitů, kolik je potřeba ( mapa >> sloupec+radek*(pole.getWidth()-2))
                // A poté si vezmem jen jediný bit, který je co nejvíc napravo ( &1 ), z toho nám vznikne číslo 1 nebo 0.
                // Nakonec z toho uděláme boolean (== 1)
                pole.setOnOff(sloupec + 1, radek + 1, ((mapa >> sloupec + (radek) * (pole.getWidth() - 2)) & 1) == 1);
            }
        }
    }
}