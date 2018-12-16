package _2_typy_danych;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Szkolenie {

    BigDecimal cena;
    int liczbaUczestnikow;
    String nazwa;
    LocalDate data;
    Adres adres;

    // 1. tworzenie nowego obiektu
    // budowa konstruktora = [public/private] [nazwa] [(lista_paramaterow)]
    // nazwa - taka sama jak nazwa klasy
    // konstruktor bezparametryczny
    public Szkolenie() {
        System.out.println("Wykonal sie konstruktor bezparametryczny");
    }

    // kontruktor parametryczny
    public Szkolenie(String nazwa, int liczbaUczestnikow,
                     BigDecimal cena, LocalDate data, Adres adres) {
        System.out.println("Wykonal sie kontruktor parametryczny");
        this.nazwa = nazwa;
        this.liczbaUczestnikow = liczbaUczestnikow;
        this.cena = cena;
        this.data = data;
        this.adres = adres;
    }

    // 2. wypisanie informacji o obiekcie
    // tworzenie metody
    // [public/private] [typ_zwracany] [nazwa] [(lista_parametrow)]

    public void wyswietl() {
        System.out.println("Nazwa: " + this.nazwa);
        System.out.printf("Cena: %.2f PLN\n", this.cena);
        System.out.println("Liczba uczestnikow: " + this.liczbaUczestnikow);
        System.out.println("Data: " + this.data);
        adres.wyswietl();
        System.out.println();

    }

    public BigDecimal obliczPrzychodBrutto() {
//        double przychod = this.liczbaUczestnikow * this.cena;
//        return przychod;

        BigDecimal liczbaUczestnikowBD = BigDecimal.valueOf(liczbaUczestnikow);
        return cena.multiply(liczbaUczestnikowBD);

//        return this.liczbaUczestnikow * this.cena;
    }

    public BigDecimal obliczPrzychodNetto() {
        BigDecimal vat = BigDecimal.ONE.add(StaleAplikacji.STAWKA_VAT);
        return obliczPrzychodBrutto().divide(vat, 2, RoundingMode.HALF_UP);
    }
}
