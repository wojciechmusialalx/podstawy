package _7_petle;

import java.util.Scanner;

public class Parkomat_2 {

    public static void main(String[] args) {
        final int CENA = 3;

        Scanner wejscie = new Scanner(System.in);
        System.out.println("Ile godzina będziesz parkować?");
        int godziny = wejscie.nextInt();

        int doZaplaty = godziny * CENA;
        System.out.println("Do zapłaty: " + doZaplaty);

        while(doZaplaty > 0) {
            System.out.println("Do zapłaty pozostało " + doZaplaty);
            System.out.print("Wrzuć monetę: ");
            int moneta = wejscie.nextInt();
            doZaplaty -= moneta;
        }

        if(doZaplaty < 0) {
            int reszta = -doZaplaty;  // albo Math.abs(doZaplaty)
            System.out.println("Wydaję resztę: " + reszta);
        }
        System.out.println("Dziękujemy");
    }
}
