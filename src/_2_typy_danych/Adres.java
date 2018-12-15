package _2_typy_danych;

public class Adres {
    String ulica;
    String kodPocztowy;
    String miasto;

    public Adres() {
    }

    public Adres(String ulica, String kodPocztowy, String miasto) {
        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    public void wyswietl() {
        System.out.println("Ulica: " + this.ulica);
        System.out.println("Kod pocztowy: " + this.kodPocztowy);
        System.out.println("Miasto: " + this.miasto);
    }
}
