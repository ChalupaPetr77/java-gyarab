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
public class Kosodelnik {
    
    /**
     * Makes a square with haight and length equals to inserted number  
     * @param args 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zadaneCislo = sc.nextInt();
        int uhlopricka = zadaneCislo * 2 - 1; 
        int pocetHasu = 1;
        boolean druhaPolovina = false;
        int predchozichMezer = (uhlopricka - pocetHasu) / 2;
        for (int y = 0; y < uhlopricka; y++) {
            for (int x = 0; x < predchozichMezer; x++) {
                System.out.print(" ");
            }
            
            for (int x = 0; x < pocetHasu; x++) {
                System.out.print("#");
            }
            
            druhaPolovina = pocetHasu == uhlopricka || druhaPolovina ? true : false;
            pocetHasu = druhaPolovina ? pocetHasu - 2 : pocetHasu + 2;
            predchozichMezer = (uhlopricka - pocetHasu) / 2;
            System.out.println("");
        }
    }
}
