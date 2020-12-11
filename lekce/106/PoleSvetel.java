/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lekce106;

import cz.gyarab.util.Utils;
import cz.gyarab.util.light.Matrix;

/**
 *
 * @author orenh
 */
public class PoleSvetel {
    public static void main(String[] args) {
        Matrix pole = Matrix.createHorizontal(21);
        pole.showWindow();
        //varianta 1
        /**for(int i = 0; i <= 4; i++){
            if(i % 2 == 0){
                pole.setOn(i);
            }   
        }*/
        //varianta 2
        /**for(int i = 0; i <= 4; i+=2){
            pole.setOn(i);
        }*/
        
        //ostrá podmínka 4 <= 5 -1 
        //neostrá podmínka 4 < 5
        for(int i = 0; i < pole.getSize(); i++){
            pole.setOn(i);
        }
        
        Utils.sleep(500);
        for(int i = 1; i <= pole.getSize() - 2; i++){
            System.out.println(i);
            pole.setOff(i);
        }
    }
}
