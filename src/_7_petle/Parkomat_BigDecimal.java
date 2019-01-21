package _7_petle;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Parkomat_BigDecimal {

    public static void main(String[] args) {
        final BigDecimal CENA = new BigDecimal("2.90");

        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);
        System.out.println("Ile godzin będziesz parkować?");
        int godziny = wejscie.nextInt();

        BigDecimal doZaplaty = CENA.multiply(BigDecimal.valueOf(godziny));
        System.out.println("Do zapłaty: " + doZaplaty);

        BigDecimal ileWplacono = BigDecimal.ZERO;

        while(ileWplacono.compareTo(doZaplaty) < 0) {
            System.out.println("Na razie wpłacono " + ileWplacono);
            System.out.print("Wpłać coś: ");
            BigDecimal wplata = wejscie.nextBigDecimal();
            ileWplacono = ileWplacono.add(wplata);
        }

        if(ileWplacono.compareTo(doZaplaty) > 0) {
            BigDecimal reszta = ileWplacono.subtract(doZaplaty);
            System.out.println("Wydaję resztę: " + reszta);
        }
        System.out.println("Dziękujemy");
    }
}
