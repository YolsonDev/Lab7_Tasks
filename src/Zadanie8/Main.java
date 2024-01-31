package Zadanie8;

public class Main {
    public static void main(String[] args) {
        FictionBook fictionBook1 = new FictionBook("The Lord of the Rings", "J.R.R. Tolkien", 1954, "Fantasy");
        FictionBook fictionBook2 = new FictionBook("Harry Potter", "J.K. Rowling", 1997, "Fantasy");
        NonFictionBook nonFictionBook1 = new NonFictionBook("Sapiens", "Yuval Noah Harari", 2011, 432);
        NonFictionBook nonFictionBook2 = new NonFictionBook("Cosmos", "Carl Sagan", 1980, 567);

        BookManager bookManager = new BookManager();
        // Dodawanie Książek
        bookManager.dodajKsiazke(fictionBook1);
        bookManager.dodajKsiazke(fictionBook2);
        bookManager.dodajKsiazke(nonFictionBook1);
        bookManager.dodajKsiazke(nonFictionBook2);

        // Wyświetlanie informacji o Książkach
        System.out.println("Informacje o książkach:");
        bookManager.wyswietlWszystkieKsiazki();

        // Zapisywanie ksiazek do pliku
        bookManager.zapiszInforamcjeDoPlikuKsiazki("C:/Users/TheSe/Documents/javaZapis/ksiazki.txt");

        // Odczytywnie informacji o ksiazach z pliku
        System.out.println("\nZapisane ksiązki w pliku:");
        bookManager.odczytajPlikKsiazki("C:/Users/TheSe/Documents/javaZapis/ksiazki.txt");

        // Ponowne wyświetlanie informacji o Książkach
        System.out.println("Ponowne informacje o książkach:");
        bookManager.wyswietlWszystkieKsiazki();

    }
}
