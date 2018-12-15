package _2_typy_danych;

import java.time.LocalDate;
import java.time.Month;

public class ObslugaSzkolen {

    public static void main(String[] args) {
        Szkolenie szkolenieJava = new Szkolenie(
                "Szkolenie Java",
                10,
                1000,
                LocalDate.of(2018, Month.DECEMBER, 15)
        );

        szkolenieJava.nazwa = "Szkolenie Java";
        szkolenieJava.cena = 1000;
        szkolenieJava.liczbaUczestnikow = 10;
        szkolenieJava.data = LocalDate.of(2018, Month.DECEMBER, 15);

        System.out.println("Nazwa: " + szkolenieJava.nazwa);
        System.out.printf("Cena: %.2f PLN\n", szkolenieJava.cena);
        System.out.println("Liczba uczestnikow: " + szkolenieJava.liczbaUczestnikow);
        System.out.println("Data: " + szkolenieJava.data);


        Szkolenie szkoleniePython = new Szkolenie();

        szkoleniePython.nazwa = "Szkolenie Python";
        szkoleniePython.cena = 1200;
        szkoleniePython.liczbaUczestnikow = 12;
        szkoleniePython.data = LocalDate.of(2018, Month.NOVEMBER, 30);

        System.out.println("\nNazwa: " + szkoleniePython.nazwa);
        System.out.printf("Cena: %.2f PLN\n", szkoleniePython.cena);
        System.out.println("Liczba uczestnikow: " + szkoleniePython.liczbaUczestnikow);
        System.out.println("Data: " + szkoleniePython.data);
    }

}
