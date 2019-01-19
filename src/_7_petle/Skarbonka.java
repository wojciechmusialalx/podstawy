package _7_petle;

import java.util.Scanner;

public class Skarbonka {
    public static void main(String[] args) {
        /*
        while(WARUNEK) {
            instrukcje;...
        }
         */

        /* Jaś dostał pustą skarbonkę i chce zebrać 100 zł.
            Program w pętli będzie prosił o wrzucenie pieniążka do skarbonki
            tak długo, aż zbierze się 100 zł.
            (wrzucenie pieniążka = wpisanie liczby)
         */
        Scanner wejscie = new Scanner(System.in);

        int skarbonka = 0;
        while(skarbonka < 100) {
            // System.out.println("Bieżąca wartość w skarbonce: " + skarbonka);
            System.out.println("Wrzuć monetę...");
            int wrzutka = wejscie.nextInt();
            skarbonka = skarbonka + wrzutka;
        }
        System.out.println("Udało się zebrać " + skarbonka);

    }
}
