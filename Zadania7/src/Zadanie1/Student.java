/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie1;


public class Student {
    String imie,nazwisko,data,typ,kierunek;
    char plec;
    int numer_albumy,rok;

    public Student(String imie, String nazwisko, String data,char plec ,int numer_albumy, String typ ,String kierunek, int rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data = data;
        this.typ = typ;
        this.kierunek = kierunek;
        this.plec = plec;
        this.numer_albumy = numer_albumy;
        this.rok = rok;
    }
    
    
    
    
}
