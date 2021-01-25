/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lekce105;

import cz.gyarab.util.light.Matrix;

/**
 *
 * @author orenh
 */
public class Vuz {
    int pocetCestujich;
    void nastup(){
        pocetCestujich++;
        System.out.println("pocet:" + pocetCestujich);
    }
    
}
class Autobus extends Vuz {
    @Override 
    void nastup(){
        if(pocetCestujichMaJizdenku()){
            super.nastup();
        }
    }
    
    boolean pocetCestujichMaJizdenku(){
        return false;
    }
}
