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
    
    private final Matrix matrix = Matrix.createMatrix(7, 7);
    private int hodnota;
    private final int a = 1;
    private final int b = 3;
    private final int c = 5;

    
    public KostkaK(){
        matrix.setTitle("Kostka");
        matrix.showWindow();
    }

    public KostkaK(int hodnota) {
        this();
        this.hodnota = hodnota;
        rozsvit();
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
        matrix.setOnOff(a, a, hodnota > 3);
        matrix.setOnOff(a, c, hodnota > 1);
        matrix.setOnOff(b, a, hodnota > 5);
        matrix.setOnOff(b, b, hodnota % 2 == 1);
        matrix.setOnOff(b, c, hodnota > 5);
        matrix.setOnOff(c, a, hodnota > 1);
        matrix.setOnOff(c, c, hodnota > 3);
        matrix.setOnOff(a, b, hodnota > 7);
        matrix.setOnOff(c, b, hodnota > 7);
    }
}
