package Zadanie8;

public class FictionBook extends Book{
    private String gatunek;
    public FictionBook(String tytul, String autor, int rocznik, String gatunek){
        super(tytul, autor, rocznik);
        this.gatunek = gatunek;
    }
    @Override
    public void infoKsiazka(){
        System.out.println("Fikcyjna książka:");
        System.out.println("Tytuł: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Rocznik: " + rocznik);
        System.out.println("Gatunek: " + gatunek);
    }
}
