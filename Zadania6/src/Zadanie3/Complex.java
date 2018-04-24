/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie3;

/**
 *
 * @author Mati
 */
public class Complex {
    
    static double re;
    static double im;

      
    public Complex(double re, double im){
        this.re = re;
        this.im = im;
    }

    public static void module(Complex z1){
        double mod = Math.sqrt(re * re + im * im);  
        System.out.println("Moduł wynosi: " + mod);
    }

    public static void coupling(Complex z1){
        if(im<0){
            System.out.println("Sprzezenie z1 wynosi: " + re + "+" + -(im) + "i");
        }
        else{
            System.out.println("Sprzezenie z1 wynosi: " + re + -(im) + "i");
        }
    }

    public static void main(String[] args){
        System.out.println("Zadanie 3 >");
        Complex z1 = new Complex(4, 6);
        module(z1);
        coupling(z1);
    }

}
