/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadania5;

/**
 *
 * @author Mati
 */
public class Ksiazka {
    private String autor;
    private int liczba_stron, rok_wydania, cena;

    public Ksiazka(String autor, int liczba_stron, int rok_wydania, int cena) {
        this.autor = autor;
        this.liczba_stron = liczba_stron;
        this.rok_wydania = rok_wydania;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Ksia\u017cka{" + "autor=" + autor + ", liczba_stron=" + liczba_stron + ", rok_wydania=" + rok_wydania + ", cena=" + cena + '}';
    }

    public String getAutor() {
        return autor;
    }

    public int getLiczba_stron() {
        return liczba_stron;
    }

    public int getRok_wydania() {
        return rok_wydania;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    
    
}
//tytuł, autor, liczba stron, rok wydania, cena
