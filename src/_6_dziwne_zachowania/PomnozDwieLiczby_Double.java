package _6_dziwne_zachowania;

import java.util.Locale;
import java.util.Scanner;

public class PomnozDwieLiczby_Double {

    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US); // dzięki temu przyjmie liczby pisane z kropką (tylko z kropką)
        System.out.println("Podaj dwie liczby:");
        double arg1 = wejscie.nextDouble();
        double arg2 = wejscie.nextDouble();

        double wynik = arg1 * arg2;
        System.out.println(wynik);
    }
}
