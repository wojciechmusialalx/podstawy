package _7_petle;

/* Program:
 * pyta "Ile godzin będziesz parkować?",
 * oblicza kwotę do zapłaty zakładając, że jedna godzina kosztuje 3zł
 * w pętli prosi o wrzucenie kolejnej monety
 * aż klient wrzuci wymaganą kwotę (wrzucenie monety = wczytanie liczby Scannerem)
 * na końcu... pomyślcie sami
 */
import java.util.Scanner;

public class Parkomat {

    public static void main(String[] args) {
        final int CENA = 3;

        Scanner wejscie = new Scanner(System.in);
        System.out.println("Ile godzina będziesz parkować?");
        int godziny = wejscie.nextInt();

        int doZaplaty = godziny * CENA;
        System.out.println("Do zapłaty: " + doZaplaty);

        int ileWplacono = 0;

        while(ileWplacono < doZaplaty) {
            System.out.println("Na razie wpłacono " + ileWplacono);
            System.out.print("Wrzuć monetę: ");
            int moneta = wejscie.nextInt();
            ileWplacono += moneta;
        }

        if(ileWplacono > doZaplaty) {
            int reszta = ileWplacono - doZaplaty;
            System.out.println("Wydaję resztę: " + reszta);
        }
        System.out.println("Dziękujemy");
    }
}
