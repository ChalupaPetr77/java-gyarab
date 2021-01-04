/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lekce108;

/**
 *
 * @author orenh
 */
public class Retezec {
    public static void main(String[] args) {
        String s = "AHOJ";
        char[] poleZnaku = s.toCharArray();
        String zPole = new String(poleZnaku);
        System.out.println(s.equals(zPole));
        System.out.println(s == zPole);
    }
}
