import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class FillText {
    public static void main(String[] args) {
        // Ścieżka do pliku, do którego chcesz zapisać wyjście
        String sciezkaDoPliku = "C:/Users/TheSe/Documents/javaZapis/plik.txt";
        try {
            // Tworzymy obiekt FileOutputStream, który wskazuje na plik, do którego będziemy zapisywać
            FileOutputStream fileOutputStream = new FileOutputStream(new File(sciezkaDoPliku));
            // Tworzymy obiekt PrintStream, który wskazuje na nasz niestandardowy strumień wyjścia
            PrintStream customOut = new PrintStream(fileOutputStream);
            // Zapisujemy niestandardowy strumień wyjścia (PrintStream) jako standardowy strumień wyjścia (System.out)
            System.setOut(customOut);
            // Teraz wszystko, co jest wypisywane na System.out, zostanie zapisane do pliku
            System.out.println("To jest tekst zapisany do pliku.");
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
