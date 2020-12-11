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
public class PoleSvetel2D {
    public static void main(String[] args) {
        Matrix pole = Matrix.createMatrix(5, 5);
        pole.showWindow();
        switch(0){
            case 0:
                sachovnice(pole);
                break;
            case 1: 
                trojuhelnik(pole);
                break;
            case 2: 
                cary(pole);
                break;
            case 3: 
                tecky(pole);
                break;
        }
        
        /**for(int x=0;x < pole.getWidth();x++){
            for(int y=0; y < pole.getHeight();y++){
                pole.setOn(x, y);
            }
        }
        
        Utils.sleep(500);
        for(int x=0;x < pole.getWidth();x++){
            for(int y=0; y < pole.getHeight();y++){
                if((x + y) % 2 == 1){
                    pole.setOff(x, y);
                }
            }
        }*/
    }
    
    public static void sachovnice(Matrix pole){
        for(int x=0;x < pole.getWidth();x++){
            for(int y=0; y < pole.getHeight();y++){
                if((x + y) % 2 == 0){
                    pole.setOn(x, y);
                }
            }
        }
    };      
            
    public static void trojuhelnik(Matrix pole){
        for(int x=0;x < pole.getWidth();x++){
            for(int y=0; y < pole.getHeight();y++){//y = x
                if(x <= y){
                    pole.setOn(x, y);
                }
            }
        }
    };
    
    public static void cary(Matrix pole){
        for(int x=0;x < pole.getWidth();x = x + 2){
            for(int y=0; y < pole.getHeight();y++){
                pole.setOn(x, y);
            }
        }
    };
    
    public static void tecky(Matrix pole){
        for(int x=0;x < pole.getWidth();x++){
            for(int y=0; y < pole.getHeight();y++){
                if(y % 2 == 1 && x % 2 == 1 ){
                    pole.setOn(x, y);
                }
            }
        }
    };
}
