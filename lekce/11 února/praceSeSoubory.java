/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lekce109;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author orenh
 */
public class praceSeSoubory {
    public static void main(String[] args) {
        File jmenoSouboru = new File("build.xml");
        
        try {
            Reader vstup = new FileReader(jmenoSouboru);
            
            try {
                while (vstup.read() >= 0) {
                    char ch = (char)vstup.read();
                    System.out.println(ch);
                }
            } catch (IOException ex) {
                System.out.println(ex);
            }
        } catch (FileNotFoundException ex){
            System.out.println(ex);
            System.out.println("chyba");
        }
        
    }
}
