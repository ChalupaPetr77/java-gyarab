/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lekce106;

/**
 *
 * @author orenh
 */
public class Podmínka {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        if(a > b){
            System.out.println(a);
        } else if(a == b){
            System.out.println("shoda");
        } else {
            System.out.println(b);
        }
    }
}
