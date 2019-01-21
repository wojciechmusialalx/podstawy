package _8_funkcje;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ProgramUzywajacyFunkcji {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);

        System.out.println("Podaj liczbę: ");
        double x = wejscie.nextDouble();

        double poleKwadratu = FunkcjeGeometryczne.poleKwadratu(x);
        System.out.println("Pole kwadratu: " + poleKwadratu);

        double poleKola = FunkcjeGeometryczne.poleKola(x);
        System.out.println("Pole koła: " + poleKola);

        System.out.println("A teraz wylosuję sobie liczbę");
        double losowa = Math.random() * 100;  // wartość od 0 do 100
        System.out.println("losowa: " + losowa);

        System.out.println("Pole kwadratu losowej: "
                + FunkcjeGeometryczne.poleKwadratu(losowa));

        System.out.println("Pole koła losowa: "
                + FunkcjeGeometryczne.poleKola(losowa));


        FunkcjeGeometryczne obiekt = new FunkcjeGeometryczne();
        poleKwadratu = obiekt.poleKwadratu(losowa);

    }
}
