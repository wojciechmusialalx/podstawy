package _6_dziwne_zachowania;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class PomnozDwieLiczby_BigDecimal {

    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US); // dzięki temu przyjmie liczby pisane z kropką (tylko z kropką)
        System.out.println("Podaj dwie liczby:");
        BigDecimal arg1 = wejscie.nextBigDecimal();
        BigDecimal arg2 = wejscie.nextBigDecimal();

        BigDecimal wynik = arg1.multiply(arg2);
        System.out.println(wynik);

        wynik = wynik.setScale(2, RoundingMode.HALF_UP);
        System.out.println(wynik);
    }
}
