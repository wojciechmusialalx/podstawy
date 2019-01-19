package _7_petle;

import java.util.Scanner;

public class Silnia {
    static long silnia(int n) {
        long wynik = 1;
        for(int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);

        while(true) {
            System.out.print("Podaj kolejną liczbę: ");

            if(! wejscie.hasNextInt()) {
                System.out.println("Do widzenia");
                break;
            }
            int liczba = wejscie.nextInt();
            long wynik = silnia(liczba);
            System.out.println(liczba + "! = " + wynik);
        }
    }

}
