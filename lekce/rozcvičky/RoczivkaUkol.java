/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lekce109;

/**
 *
 * @author orenh
 */
public class RoczivkaUkol {
    public static void main(String[] args) {
        for (int a = 1; a < 100; a++) {
            for(int b = 1; b < 100; b++){
                for(int c = 1; c < 100; c++){
                    if ((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) == 0.0 && a <= b){
                        System.out.println(a + " " + b + " " + c);
                    } 
                }
            }
        }
    }
}
