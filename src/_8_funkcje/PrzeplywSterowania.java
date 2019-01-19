package _8_funkcje;

public class PrzeplywSterowania {

    static void metoda0() {
        // tego napisu nigdzie nie zobaczymy, bo main nie wywołuje tej metody
        System.out.println("To jest metoda 0");
    }

    static void metoda1() {
        System.out.println("metoda 1");
    }

    public static void main(String[] args) {
        System.out.println("Początek programu");
        PrzeplywSterowania.metoda1();
        System.out.println("A Znowu jestem w main");
        metoda1();  // nie trzeba podawać nazwy klasy, kiedy jesteśmy w tej klasie
        System.out.println("B Znowu jestem w main");
        System.out.println();
        metoda2("Ala ma kota");
        System.out.println();
        metoda2("Katowice to fajne miasto.");
        System.out.println();

        int wynik = powtorz("Lubię Javę", 3);
        System.out.println("wynik powtarzania: " + wynik);

        System.out.println("Koniec programu");
    }

    static void metoda2(String napis) {
        System.out.println("metoda2 otrzymała parametr " + napis);
        System.out.println("Ten napis ma liter: " + napis.length());
        System.out.println("A napisany wielkimi literami: " + napis.toUpperCase());
    }

    static int powtorz(String napis, int ileRazy) {
        for(int i = 0; i < ileRazy; i++) {
            System.out.println(napis);
        }
        // wynikiem funkcji jest informacja ile znaków zostało w sumie wypisanych
        return napis.length() * ileRazy;
    }
}
