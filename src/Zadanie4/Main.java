package Zadanie4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Osoba[] tablicaDoZapisu = {
                new Osoba("Sebastian", 26),
                new Osoba("Natalia", 23),
                new Osoba("Michał", 25)
        };
        String sciezkaDoPliku = "C:/Users/TheSe/Documents/javaZapis/osoby.txt";
        try {
            // Tworzymy obiekt FileOutputStream, który wskazuje na plik, do którego będziemy zapisywać
            FileOutputStream fileOutputStream = new FileOutputStream(new File(sciezkaDoPliku));
            // Tworzymy obiekt PrintStream, który wskazuje na nasz niestandardowy strumień wyjścia
            PrintStream customOut = new PrintStream(fileOutputStream);
            // Zapisujemy niestandardowy strumień wyjścia (PrintStream) jako standardowy strumień wyjścia (System.out)
            System.setOut(customOut);
            // Teraz wszystko, co jest wypisywane na System.out, zostanie zapisane do pliku
            for(Osoba osoba : tablicaDoZapisu){
                osoba.wyswietlInfo();
            }
            // Poniższa linia odpowiada za powrót do standarowego strumienia wyjścia czyli na konsole(możemy go użyć, jeśli chcemy przywrócić normalne wyjście na konsolę)
            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out))); // teraz wyjście będzie wyświetlane na konsole
            // Zamykamy strumień wyjścia, co spowoduje też zamknięcie pliku
            customOut.close();
            System.out.println("Dane zostały zapisane do pliku.");
        } catch (Exception e) {
            // Obsługa błędów związanych z operacją zapisu do pliku
            e.printStackTrace();
        }
        try {
            // Tworzymy obiekt FileReader, który odczytuje znaki z pliku
            FileReader fileReader = new FileReader(sciezkaDoPliku);
            // Tworzymy obiekt BufferedReader, który umożliwia odczyt linia po linii
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // Odczytujemy tekst z pliku linia po linii
            System.out.println("Dane z pliku: ");
            String linia;
            while ((linia = bufferedReader.readLine()) != null) {
                System.out.println(linia);
            }
            // Zamykamy BufferedReader i FileReader
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            // Obsługa błędów związanych z operacją odczytu pliku
            e.printStackTrace();
        }
    }
}
