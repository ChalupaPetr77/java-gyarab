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
public class ViceRozmernePole {
    private int[][] pole2D; //deklarace/inicializace 2D pole 
    //= pole obsahuje misto [int, int] tak obsahuje [ [int, int, int], [int, int, int], [int, int, int] ]
    //souřadnice jdou od shora jako v Excelu první políčko 0x0
    //jsou i trojrozměrny pole a více rozměrné

    public static void main(String[] args) {
      int[][] pole = new int[4][]; //4 = řádky hlavni pole
      pole[0] = new int[5]; //řádek 0, sloupec 5
      pole[1] = new int[6]; //řádek 1, sloupec 6
      pole[2] = new int[7]; //řádek 2, sloupec 7
      pole[3] = new int[8]; //řádek 3, sloupec 8
      
      int[][] obdelnik = new int[4][6]; //4 řádky a je to hlavni pole, 6 sloupců a jsou to vedlejší pole
    }
}
