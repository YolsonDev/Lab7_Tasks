package Zadanie8;

public class NonFictionBook extends Book{
    private int iloscStron;
    public NonFictionBook(String tytul, String autor, int rocznik, int iloscStron){
        super(tytul, autor, rocznik);
        this.iloscStron = iloscStron;
    }
    @Override
    public void infoKsiazka(){
        System.out.println("Nie fikcyjna książka:");
        System.out.println("Tytuł: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Rocznik: " + rocznik);
        System.out.println("Ilość stron: " + iloscStron);
    }
}
