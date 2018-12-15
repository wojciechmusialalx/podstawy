package _2_typy_danych;


import java.util.Scanner;

public class TypyObiektowe {

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);

        System.out.print("Podaj swoje imie: ");

        String imie = wejscie.nextLine();

        int iloscZnakow = imie.length();

        System.out.println("Słowo: " + imie + " ma "
                + iloscZnakow + " znakow");

        if (iloscZnakow <= 6) {
            System.out.println("Krotkie slowo");
        } else {
            System.out.println("Dlugie slowo");
        }

        boolean czyKonczySieNaA = imie.endsWith("a") || imie.endsWith("A");
//        boolean czyKonczySieNaA = imie.toLowerCase().endsWith("a");

        if (czyKonczySieNaA) {
            if (imie.equalsIgnoreCase("Kuba")) {
                System.out.println("meskie");
            } else {
                System.out.println("damskie");
            }
        } else {
            System.out.println("meskie");
        }

        char znak = imie.charAt(iloscZnakow - 1);

        if ((znak == 'a' || znak == 'A') && !imie.equalsIgnoreCase("Kuba")) {
            System.out.println("damskie");
        } else {
            System.out.println("meskie");
        }

    }
}
