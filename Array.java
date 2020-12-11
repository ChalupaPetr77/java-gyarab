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
public class Array {
    private int i1;
    private int i2;
    private int i3;
    private int i4;
    
    public static void main(String[] args) {
        Array pm = new Array(1, 2, 3, 4);
    }

    public Array(int i1, int i2, int i3, int i4) {
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
    }
   
    public int soucet(){
        return this.i1 + this.i2 + this.i3 + this.i4;
    }
}
