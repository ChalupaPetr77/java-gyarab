/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lekce107;

/**
 *
 * @author 2020-e-holis
 */
public class Array2 {
    private int[] pole;
    
    public int soucet(){
        int vysledek = 0;
        for(int i = 0; i < pole.length; i++){
            vysledek += pole[i]; // = vysledek = vysledek + pole[i];
        }
        
        System.out.println(vysledek);
        return vysledek;
    }
    
    public int soucin(){
        int s = 1;
        for (int i = 0; i < pole.length; i++){
            s *= pole[i];
        }
        
        return s;
    }

    public Array2() {
        for (int i = 0; i < 10; i++){
            this.pole[i] = i;
        }
    }

    public Array2(int ... pole) { // libovolny pocet parametrů
        this.pole = pole;
    }
    
    public static void main(String[] args) {
        /**Array2 pole = new Array2(); //bezparametricky
        System.out.println(pole.soucet());*/
        Array2 pole2 = new Array2(1, 2, 3, 4); //parametricky
        System.out.println(pole2.soucet());
        System.out.println(pole2.soucin());
        
        int[] polePrvku = new int[10];
        for(int i = 0; i < polePrvku.length; i++){
            polePrvku[i] = i;
        }
        
        int[] polePrvku2 = new int[5];
        polePrvku2[0] = 125;
        System.out.println(polePrvku2[0]);
        
        int[] poleKonkretnichPrvku = {1, 2, 3, 4, 5, 20}; // = int[] poleKonkretnichPrvku = int[] {1, 2, 3, 4, 5, 20};
    }
}
