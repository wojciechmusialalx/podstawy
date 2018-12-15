package _2_typy_danych;

import java.time.LocalDate;

public class Szkolenie {

    double cena;
    int liczbaUczestnikow;
    String nazwa;
    LocalDate data;

    // 1. tworzenie nowego obiektu
    // budowa konstruktora = [public/private] [nazwa] [(lista_paramaterow)]
    // nazwa - taka sama jak nazwa klasy
    // konstruktor bezparametryczny
    public Szkolenie() {
        System.out.println("Wykonal sie konstruktor bezparametryczny");
    }

    // kontruktor parametryczny
    public Szkolenie(String nazwa, int liczbaUczestnikow,
                     double cena, LocalDate data) {
        System.out.println("Wykonal sie kontruktor parametryczny");
        this.nazwa = nazwa;
        this.liczbaUczestnikow = liczbaUczestnikow;
        this.cena = cena;
        this.data = data;
    }

    // 2. wypisanie informacji o obiekcie
    // tworzenie metody
    // [public/private] [typ_zwracany] [nazwa] [(lista_parametrow)]

    public void wyswietl() {
        System.out.println("Nazwa: " + this.nazwa);
        System.out.printf("Cena: %.2f PLN\n", this.cena);
        System.out.println("Liczba uczestnikow: " + this.liczbaUczestnikow);
        System.out.println("Data: " + this.data);
        System.out.println();
    }



}
