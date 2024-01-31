import java.io.File;
import java.io.IOException;

public class NewFile {
    public static void main(String[] args) {
        // Ścieżka do nowego pliku
        String sciezkaDoPliku = "C:/Users/TheSe/Documents/javaZapis/plik.txt";
        try {
            // Tworzymy obiekt File reprezentujący plik
            File nowyPlik = new File(sciezkaDoPliku);
            // Sprawdzamy, czy plik już istnieje
            if (nowyPlik.createNewFile()) {
                System.out.println("Plik został utworzony pomyślnie.");
            } else {
                System.out.println("Plik już istnieje.");
            }
        } catch (IOException e) {
            // Obsługa błędów związanych z operacją tworzenia pliku
            e.printStackTrace();
        }
    }
}
