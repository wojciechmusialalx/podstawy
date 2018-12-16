package _2_typy_danych;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class ObslugaSzkolen {

    public static void main(String[] args) {
        Adres adresSzkoleniaJava = new Adres("Lesna 5", "01-000", "Warszawa");
        Szkolenie szkolenieJava = new Szkolenie(
                "Szkolenie Java", 10, new BigDecimal("1000"),
                LocalDate.of(2018, Month.DECEMBER, 15), adresSzkoleniaJava
        );
        szkolenieJava.wyswietl();

        BigDecimal przychodBrutto = szkolenieJava.obliczPrzychodBrutto();
        BigDecimal przychodNetto = szkolenieJava.obliczPrzychodNetto();
        System.out.println("Przychod brutto ze szkolenia: " + przychodBrutto);
        System.out.println("Przychod netto ze szkolenia: " + przychodNetto);


        Adres adresSzkoleniaPython = new Adres("Lesna 15", "01-000", "Krakow");
        Szkolenie szkoleniePython = new Szkolenie(
                "Szkolenie Python", 12, new BigDecimal("1200"),
                LocalDate.of(2018, Month.NOVEMBER, 30), adresSzkoleniaPython
        );
        szkoleniePython.wyswietl();
    }

}
