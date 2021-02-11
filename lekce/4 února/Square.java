/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lekce109;
import java.util.Scanner;

/**
 *
 * @author orenh
 */
public class Square {
    
    /**
     * Makes a square with haight and length equals to inserted number  
     * @param args 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        for (int y = 0; y < max; y++) {
            for (int x = 0; x < max; x++) {
                String endOfLine = (x + 1) == max ? "\n" : "";
                System.out.print("*" + endOfLine);
            }
        }
    }
}
/**
            druhaPolovina = pocetHasu == uhlopricka || druhaPolovina ? true : false;
            pocetHasu = druhaPolovina ? pocetHasu - 2 : pocetHasu + 2;*/
