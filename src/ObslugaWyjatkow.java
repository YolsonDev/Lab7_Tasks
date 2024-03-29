public class ObslugaWyjatkow {
    public static void main(String[] args) {
        try {
            // Kod, który może generować wyjątki
            int dzielna = 10;
            int dzielnik = 0;
            int wynik = dzielna / dzielnik;
        } catch (ArithmeticException e) {
            System.out.println("Wystąpił błąd arytmetyczny: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Wystąpił inny błąd: " + e.getMessage());
        } finally {
            System.out.println("Zawsze wykonuję się, niezależnie od wyjątku.");
        }
    }
}
