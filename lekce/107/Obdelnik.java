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

public class Obdelnik {

    private double a;
    private double b;

    public Obdelnik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double obsah() {
        return a * b;
    }

    public double obvod() {
        return 2 * (a + b);
    }
}
