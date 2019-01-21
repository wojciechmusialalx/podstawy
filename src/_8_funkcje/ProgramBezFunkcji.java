package _8_funkcje;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBezFunkcji {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);

        System.out.println("Podaj liczbę: ");
        double x = wejscie.nextDouble();

        double poleKwadratu = x * x;
        System.out.println("Pole kwadratu: " + poleKwadratu);

        double poleKola = Math.PI * x * x;
        System.out.println("Pole koła: " + poleKola);

        System.out.println("A teraz wylosuję sobie liczbę");
        double losowa = Math.random() * 100;  // wartość od 0 do 100
        System.out.println("losowa: " + losowa);

        double poleKwadratu2 = losowa * losowa;
        System.out.println("Pole kwadratu losowej: " + poleKwadratu);

        double poleKola2 = Math.PI * losowa * losowa;
        System.out.println("Pole koła losowa: " + poleKola);

    }
}
