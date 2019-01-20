package _8_funkcje;

import java.util.concurrent.atomic.AtomicInteger;

public class Parametry1 {

    static void metoda1(int x) {
        System.out.println("metoda1, x = " + x);
        x += 5;
        System.out.println("metoda1, x = " + x);
    }

    static void metoda2(Skarbona skarbonka) {
        System.out.println("metoda2, wartosc = " + skarbonka.wartosc);
        skarbonka.wplata(20);
        System.out.println("metoda2, wartosc = " + skarbonka.wartosc);
    }

    static void metoda3(int[] tablica) {
        System.out.println("metoda3: t[0] = " + tablica[0]);
        tablica[0] += 7;
        System.out.println("metoda3: t[0] = " + tablica[0]);
        tablica = new int[] {13, 14, 15, 16};
        System.out.println("metoda3: t[0] = " + tablica[0]);
    }

    static void metoda4(Integer y) {
        System.out.println("metoda4, y = " + y);
        y += 3;
        // to jest realizowane mniej więcej jako:
        // y = new Integer(y + 3);
        System.out.println("metoda4, y = " + y);
    }

    static void metoda5(AtomicInteger ai) {
        System.out.println("metoda5, ai = " + ai);
        ai.addAndGet(44);
        System.out.println("metoda5, ai = " + ai);
    }

    public static void main(String[] args) {
        int x = 100;
        System.out.println("main, x = " + x);
        metoda1(x);
        System.out.println("main, x = " + x);
        System.out.println();

        Skarbona skarbonka = new Skarbona();
        System.out.println("main, wartosc = " + skarbonka.wartosc);
        metoda2(skarbonka);
        System.out.println("main, wartosc = " + skarbonka.wartosc);
        System.out.println();

        int[] t = {50, 120};
        System.out.println("main: t[0] = " + t[0]);
        metoda3(t);
        System.out.println("main: t[0] = " + t[0]);
        System.out.println();

        Integer yy = new Integer(200);
        System.out.println("main,   yy = " + yy);
        metoda4(yy);
        System.out.println("main,   yy = " + yy);
        System.out.println();

        AtomicInteger atomic = new AtomicInteger(300);
        System.out.println("metoda5, atomic = " + atomic);
        metoda5(atomic);
        System.out.println("metoda5, atomic = " + atomic);

    }
}


class Skarbona {
    int wartosc = 0;

    void wplata(int ile) {
        wartosc += ile;
    }
}
