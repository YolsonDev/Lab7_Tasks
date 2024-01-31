package Zadanie7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię kierowcy: ");
        String imie = scanner.nextLine();

        System.out.print("Podaj nazwisko kierowcy: ");
        String nazwisko = scanner.nextLine();

        System.out.print("Podaj wiek kierowcy: ");
        int wiek = scanner.nextInt();
        scanner.nextLine();  // Skonsumuj znak nowej linii

        System.out.print("Podaj PESEL kierowcy: ");
        String pesel = scanner.nextLine();

        System.out.print("Podaj VIN auta: ");
        String vin = scanner.nextLine();

        System.out.print("Podaj rocznik auta: ");
        int rocznik = scanner.nextInt();
        scanner.nextLine();  // Skonsumuj znak nowej linii

        System.out.print("Podaj markę auta: ");
        String marka = scanner.nextLine();

        System.out.print("Podaj model auta: ");
        String model = scanner.nextLine();

        Kierowca kierowca = new Kierowca(imie, nazwisko, wiek, pesel);
        Auto auto = new Auto(vin, rocznik, marka, model);

        String sciezkaDoPliku1 = "C:/Users/TheSe/Documents/javaZapis/auta.txt";
        String sciezkaDoPliku2 = "C:/Users/TheSe/Documents/javaZapis/Kierowca.txt";

        kierowca.zapiszInforamcjeDoPlikuKierowcy(sciezkaDoPliku1);
        auto.zapiszInforamcjeDoPlikuAuto(sciezkaDoPliku2);
    }
}
