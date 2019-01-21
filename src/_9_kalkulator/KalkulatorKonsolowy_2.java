package _9_kalkulator;

import java.util.Locale;
import java.util.Scanner;

public class KalkulatorKonsolowy_2 {

    /* Instrukcje sterujące języka Java:
        * if   (else)
        * switch
        * while
        * for
        * try / catch / finally
        * return, break, continue
     */


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

                double wynik;
                switch(operacja) {
                    case "+":
                        wynik = arg1 + arg2;
                        break;
                    case "-":
                        wynik = arg1 - arg2;
                        break;
                    case "*":
                        wynik = arg1 * arg2;
                        break;
                    case "/":
                        wynik = arg1 / arg2;
                        break;
                    default:
                        wynik = 0;
                }
                System.out.println("    wynik: " + wynik);
            } catch(Exception e) {
                break;
            }
        }
        System.out.println("Dziekujemy, papa");
    }
}
