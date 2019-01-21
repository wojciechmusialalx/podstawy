package _7_petle;

import java.util.Scanner;

public class Skarbonka1 {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);

        int skarbonka = 0;
        while(skarbonka < 100) {
            // System.out.println("Bieżąca wartość w skarbonce: " + skarbonka);
            System.out.println("Wrzuć monetę...");
            int wrzutka = wejscie.nextInt();
            skarbonka += wrzutka;
        }
        System.out.println("Udało się zebrać " + skarbonka);

    }
}
