/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie1;

/**
 *
 * @author Mati
 */
public class Nauczyciel extends Osoba {
    
    private String tytul;
    private String katedra;
    private String przedmiot;

    public Nauczyciel(String imie, String nazwisko, String data_urodzenia,char plec,String tytul, String katedra, String przedmiot) {
        super(imie, nazwisko, data_urodzenia, plec);
        this.tytul = tytul;
        this.katedra = katedra;
        this.przedmiot = przedmiot;
    }

    public String getTytul() {
        return tytul;
    }

    public String getKatedra() {
        return katedra;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setKatedra(String katedra) {
        this.katedra = katedra;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" + "tytul=" + tytul + ", katedra=" + katedra + ", przedmiot=" + przedmiot + '}';
    }

        


}


