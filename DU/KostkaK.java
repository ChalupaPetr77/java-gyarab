/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DU;

import cz.gyarab.util.Utils;
import cz.gyarab.util.light.Matrix;

/**
 *
 * @author orenh
 */
public class KostkaK {
    public static void main(String[] args) {
        KostkaK k = new KostkaK();
        while (true){
            for(int i = 1; i <= 9; i++){
                k.setHodnota(i);
                Utils.sleep(1000);
            }
        }
    }
    
    private final Matrix matrix = Matrix.createMatrix(3, 3);
    private int hodnota; 
    
    public KostkaK(){
        matrix.setTitle("kostka");
        matrix.showWindow();
    }

    public int getHodnota() {
        return hodnota;
    }

    public void setHodnota(int hodnota) {
        this.hodnota = hodnota;
        rozsvit();
    }
    
    private void rozsvit(){
        /**if(hodnota > 3){
            matrix.setOn(0, 0);
        } else {
            matrix.setOff(0, 0);
        }*/
        matrix.setOnOff(0, 0, hodnota > 3);
        matrix.setOnOff(0, 2, hodnota > 1);
        matrix.setOnOff(1, 0, hodnota > 5);
        matrix.setOnOff(1, 1, hodnota % 2 == 1);
        matrix.setOnOff(1, 2, hodnota > 5);
        matrix.setOnOff(2, 0, hodnota > 1);
        matrix.setOnOff(2, 2, hodnota > 3);
        matrix.setOnOff(0, 1, hodnota > 7);
        matrix.setOnOff(2, 1, hodnota > 7);
    }
}
