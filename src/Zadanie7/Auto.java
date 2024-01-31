package Zadanie7;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Auto{
    private String vin;
    protected int rocznik;
    public String marka;
    public String model;

    public Auto(String vin, int rocznik, String marka, String model){
        this.vin = vin;
        this.rocznik = rocznik;
        this.marka = marka;
        this.model = model;
    }
    public void wypiszAuto() {
        System.out.println("\nInformacje o aucie:");
        System.out.println("VIN: " + vin);
        System.out.println("Rocznik: " + rocznik);
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
    }
    public void zapiszInforamcjeDoPlikuAuto(String sciezkaDoPliku){
        try {
            // Tworzymy obiekt FileOutputStream, który wskazuje na plik, do którego będziemy zapisywać
            FileOutputStream fileOutputStream = new FileOutputStream(new File(sciezkaDoPliku), true);
            // Tworzymy obiekt PrintStream, który wskazuje na nasz niestandardowy strumień wyjścia
            PrintStream customOut = new PrintStream(fileOutputStream);
            // Zapisujemy niestandardowy strumień wyjścia (PrintStream) jako standardowy strumień wyjścia (System.out)
            System.setOut(customOut);
            // Teraz wszystko, co jest wypisywane na System.out, zostanie zapisane do pliku
            System.out.println("Informacje o aucie:");
            System.out.println("VIN: " + vin);
            System.out.println("Rocznik: " + rocznik);
            System.out.println("Marka: " + marka);
            System.out.println("Model: " + model);
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
