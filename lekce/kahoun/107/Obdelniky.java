/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lekce107;

/**
 *
 * @author 2020-e-holis
 */
public class Obdelniky {
    private Obdelnik[] obdelniky;

    public static void main(String[] args) {
        Obdelniky pole = new Obdelniky(
                new Obdelnik(2, 3),
                new Obdelnik(3, 5)
        );
        
        System.out.println(pole.obsah());
        System.out.println(pole.obdelniky.length);
    }
    
    public Obdelniky(Obdelnik ... obdelniky) {
        this.obdelniky = obdelniky;
    }
    
    public double obsah(){
        double s = 0;
        for(int i = 0; i < obdelniky.length; i++){
            s += obdelniky[i].obsah();
        }
        
        return s;
    }
}
