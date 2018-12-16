package _2_typy_danych;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AnalizaDaty {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);

        System.out.print("Podaj date urodzenia (yyyy-MM-dd): ");

        String data = wejscie.nextLine();

        // konwersja daty(String) na LocalDate
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dataUrodzenia = LocalDate.parse(data, formatter);

        // pobranie daty teraz
        LocalDate dzisiaj = LocalDate.now();

        // obliczenie roznicy dat
        Period roznica = Period.between(dataUrodzenia, dzisiaj);

        // sprawdzenie wieku i wyswietlenie wyniku
        int wiek = roznica.getYears();

        if (wiek < 18) {
            System.out.println("Niepelnoletni");
        } else if (wiek < 65) {
            System.out.println("Wiek produkcyjny");
        } else {
            System.out.println("Wiek emerytalny");
        }
    }
}
