import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        // Ścieżka do istniejącego pliku
        String sciezkaDoPliku = "C:/Users/TheSe/Documents/javaZapis/plik.txt";
        try {
        // Tworzymy obiekt FileReader, który odczytuje znaki z pliku
            FileReader fileReader = new FileReader(sciezkaDoPliku);
        // Tworzymy obiekt BufferedReader, który umożliwia odczyt linia po linii
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        // Odczytujemy tekst z pliku linia po linii
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
