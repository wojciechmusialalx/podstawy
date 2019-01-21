package _6_dziwne_zachowania;

import java.util.Locale;
import java.util.Scanner;

public class PomnozDwieLiczby_Int_DopiskiFinal {

    public static void main(String[] args) {
        final Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);
        System.out.println("Podaj dwie liczby:");
        final int arg1 = wejscie.nextInt();
        final int arg2 = wejscie.nextInt();

        final int wynik = arg1 * arg2;
        System.out.println("wynik zwykłego mnożenia: " + wynik);

        // jak obliczyć w sposób bezpieczny?
        try {
            final int wynik2 = Math.multiplyExact(arg1, arg2);
            System.out.println("wynik mnożenia bezpiecznego: " + wynik2);

        } catch (ArithmeticException e) {
            System.out.println("Wynik nie mieści się w zakresie");
        }

        System.out.println("Max int wynosi " + Integer.MAX_VALUE);

    }
}
