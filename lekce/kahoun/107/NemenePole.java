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
public class NemenePole {
    public static void main(String[] args) {
        final int i = 5;
        //nejde i = 10;
        final int[] p = {1, 2, 3}; //final chrání aby se nezměnilo celé pole == šipka ale jednotlivé hodnoty se měnit můžou
        System.out.println(p[2]); // vypíše 3
        p[2] = 10;
        System.out.println(p[2]); // vypíše 10
        //nelze p = new int {1, 8, 10};
    }
}
