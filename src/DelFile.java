import java.io.File;

public class DelFile {
    public static void main(String[] args) {
        // Ścieżka do pliku, który chcesz usunąć
        String sciezkaDoPliku = "C:/Users/TheSe/Documents/javaZapis/plik.txt";
        // Tworzymy obiekt File reprezentujący plik
        File plikDoUsuniecia = new File(sciezkaDoPliku);
        // Sprawdzamy, czy plik istnieje przed próbą usunięcia
        if (plikDoUsuniecia.exists()) {
        // Usuwamy plik
            if (plikDoUsuniecia.delete()) {
                System.out.println("Plik został usunięty pomyślnie.");
            } else {
                System.out.println("Nie udało się usunąć pliku.");
            }
        } else {
            System.out.println("Plik nie istnieje.");
        }
    }
}
