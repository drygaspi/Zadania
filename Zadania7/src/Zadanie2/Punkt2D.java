/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie2;

/**
 *
 * @author Mati
 */
import java.util.Random;

public class Punkt2D {
    private int x;
    private int y;

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punkt2D() {

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Punkt2D LosujPunkt(){
        Random r = new Random();
        Punkt2D p = new Punkt2D(r.nextInt(21)-10,r.nextInt(21)-10);
        return p;
    }

    @Override
    public String toString() {
        return x + "," + y;
    }
}
