/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie2;



public class Punkt {

    private int x;
    private int y;
    private int z;

    
    private static int counter;
    public static Punkt last_point;

    public Punkt(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        counter++;
        last_point = this;
    }

    public static void PokazOstatniObiekt() {
        System.out.println("Klasa Punkt o współrzędnych (x = " + last_point.x
                + " y = " + last_point.y + ""
                + " z = " + last_point.z + "). Istnieje już"
                + " " + last_point.counter + " obiekt tej klasy.");
    }
    
    @Override
    public String toString(){
        String s = "Klasa Punkt o współrzędnych (x = " + last_point.x
                + " y = " + last_point.y + ""
                + " z = " + last_point.z + "). Istnieje już"
                + " " + last_point.counter + " obiekt tej klasy.";
        return s;
    }

}