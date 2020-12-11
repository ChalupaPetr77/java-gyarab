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
public class Kostka {
    private int cislo;
    private final Matrix pole;
    
    public static void main(String[] args) {
        Kostka poleSvetel = new Kostka();
        for(int i=1;i < 7;i++){
           poleSvetel.setCislo(i);
           poleSvetel.render();
           Utils.sleep(1000);
           poleSvetel.vypniPole();
       }
    }

    protected int getCislo() {
        return cislo;
    }

    protected void setCislo(int cislo) {
        this.cislo = cislo;
    }
    
    private Kostka(){
        this.pole = Matrix.createMatrix(3, 3);
        this.pole.showWindow();
    }
    
    private void render(){
        switch(this.cislo){
               case 1:
                   hod1();
                   break;
               case 2:
                   hod2();
                   break;
               case 3:
                   hod3();
                   break;
               case 4:
                   hod4();
                   break;
               case 5:
                   hod5();
                   break;
               case 6:
                   hod6();
                   break;
           }
    }
    
    private void vypniPole(){
        for(int x=0;x < this.pole.getWidth();x++){
            for(int y=0; y < this.pole.getHeight();y++){
                pole.setOff(x, y);
            }
        }
    }
    
    private void hod1(){
        this.pole.setOn(1, 1);
    }
    
    private void hod2(){
        for(int x=0;x < this.pole.getWidth();x++){
            for(int y=0; y < this.pole.getHeight();y++){
                if(x == 0 && y == 2 || y == 0 && x == 2){
                    this.pole.setOn(x, y);
                }
            }
        }
    }
    
    private void hod3(){
        for(int x=0;x < this.pole.getWidth();x++){
            for(int y=0; y < this.pole.getHeight();y++){
                if((x + y) == 2){
                    this.pole.setOn(x, y);
                }
            }
        }
    }
    
    private void hod4(){
        for(int x=0;x < this.pole.getWidth();x+=2){
            for(int y=0; y < this.pole.getHeight();y+=2){
                this.pole.setOn(x, y);
            }
        }    
    }
    
    private void hod5(){
        for(int x=0;x < this.pole.getWidth();x++){
            for(int y=0; y < this.pole.getHeight();y++){
                if((x + y) % 2 == 0){
                    this.pole.setOn(x, y);
                }
            }
        }
    }
    
    private void hod6(){
        for(int x=0;x < this.pole.getWidth();x += 2){
            for(int y=0; y < this.pole.getHeight();y++){
                this.pole.setOn(x, y);
            }
        }
    }
}
