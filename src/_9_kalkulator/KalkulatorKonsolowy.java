package _9_kalkulator;

import java.util.Locale;
import java.util.Scanner;

public class KalkulatorKonsolowy {

    public static void main(String[] args) {
        System.out.println("Podawaj kolejne działania w formie");
        System.out.println(" 12 + 15");
        System.out.println("Zakończ wpisując napis nie będący liczbą");
        System.out.println();

        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);
        while(true) {
            System.out.print("> ");
            try {
                double arg1 = wejscie.nextDouble();
                String operacja = wejscie.next();
                double arg2 = wejscie.nextDouble();

                if("+".equals(operacja)) {
                    double wynik = arg1 + arg2;
                    System.out.println("    wynik: " + wynik);
                } else if("-".equals(operacja)) {
                    double wynik = arg1 - arg2;
                    System.out.println("    wynik: " + wynik);
                } else if("*".equals(operacja)) {
                    double wynik = arg1 * arg2;
                    System.out.println("    wynik: " + wynik);
                } else if("/".equals(operacja)) {
                    double wynik = arg1 / arg2;
                    System.out.println("    wynik: " + wynik);
                } else {
                    System.out.println("Nie ma takiej operacji: " + operacja);
                }


            } catch(Exception e) {
                break;
            }
        }
        System.out.println("Dziekujemy, papa");
    }
}
