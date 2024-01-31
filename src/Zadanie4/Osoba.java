package Zadanie4;

public class Osoba {
    private String imie;
    private int wiek;
    public Osoba(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
    }
    public void wyswietlInfo(){
        System.out.println("Informacje o osobie");
        System.out.println("Imie: " + imie);
        System.out.println("Wiek: " + wiek);
    }
}
