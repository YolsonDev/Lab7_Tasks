package Zadanie8;

import java.io.Serializable;

public abstract class Book implements Serializable {
    protected String tytul;
    protected String autor;
    protected int rocznik;
    public Book(String tytul, String autor, int rocznik){
        this.tytul = tytul;
        this.autor = autor;
        this.rocznik = rocznik;
    }
    public abstract void infoKsiazka();
}
