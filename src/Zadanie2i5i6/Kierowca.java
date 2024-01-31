package Zadanie2i5i6;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Kierowca {
    public String imie;
    public String nazwisko;
    private int wiek;
    protected String pesel;

    public Kierowca(String imie, String nazwisko, int wiek, String pesel){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.pesel = pesel;
    }

    public void wypiszInformacje(){
        System.out.println("Informacje o kierowcy:");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
        System.out.println("PESEL: " + pesel);
    }
    public void zapiszInforamcjeDoPlikuKierowcy(String sciezkaDoPliku) {
        try {
            // Tworzymy obiekt FileOutputStream, który wskazuje na plik, do którego będziemy zapisywać
            FileOutputStream fileOutputStream = new FileOutputStream(new File(sciezkaDoPliku));
            // Tworzymy obiekt PrintStream, który wskazuje na nasz niestandardowy strumień wyjścia
            PrintStream customOut = new PrintStream(fileOutputStream);
            // Zapisujemy niestandardowy strumień wyjścia (PrintStream) jako standardowy strumień wyjścia (System.out)
            System.setOut(customOut);
            // Teraz wszystko, co jest wypisywane na System.out, zostanie zapisane do pliku
            System.out.println("Informacje o kierowcy:");
            System.out.println("Imię: " + imie);
            System.out.println("Nazwisko: " + nazwisko);
            System.out.println("Wiek: " + wiek);
            System.out.println("PESEL: " + pesel);
            // Poniższa linia odpowiada za powrót do standarowego strumienia wyjścia czyli na konsole(możemy go użyć, jeśli chcemy przywrócić normalne wyjście na konsolę)
            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out))); // teraz wyjście będzie wyświetlane na konsole
            // Zamykamy strumień wyjścia, co spowoduje też zamknięcie pliku
            customOut.close();
            System.out.println("Dane zostały zapisane do pliku.");
        } catch (Exception e) {
            // Obsługa błędów związanych z operacją zapisu do pliku
            e.printStackTrace();
        }
    }
}
