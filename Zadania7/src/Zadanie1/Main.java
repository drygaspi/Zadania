/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie1;


public class Main {
    public static void main(String[] args){

        Osoba o1 = new Osoba("Piotr","Drygas","01-01-1975",'m');
        Student s1 = new Student("Piotr","Drygas","01-01-1975",'m',1111111,"inzynierskie","informatyka",1);
        Nauczyciel n1;
        n1 = new Nauczyciel("Jan","Kowalski","01-01-1970",'m',"mgr inz", "Infromatyki","Wstep do SI");

        System.out.println(o1+"\n\n");
        System.out.println(s1+"\n\n");
        System.out.println(n1);

    }
}
