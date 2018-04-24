/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie2;


import java.util.Random;

class Punkt3D extends Punkt2D {

    private int z;

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Punkt3D() {

    }

    public int getZ() {
        return z;
    }

    @Override
    public Punkt3D LosujPunkt() {
        Random r = new Random();
        Punkt3D p = new Punkt3D(r.nextInt(21) - 10, r.nextInt(21) - 10, r.nextInt(21) - 10);
        return p;
    }

    @Override
    public String toString() {
        return super.toString() + "," + z;
    }
}
