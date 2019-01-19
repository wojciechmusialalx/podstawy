package _7_petle;

import java.util.stream.IntStream;

public class FunkcjeNaTablicach {

    static int suma(int[] tablica) {
        int wynik = 0;

        for (int liczba : tablica) {
            wynik += liczba;
        }

        return wynik;
    }

    static int suma_inaczej(int[] tablica) {
        int wynik = 0;

        for (int i = 0; i < tablica.length; i++) {
            wynik += tablica[i];
        }
        return wynik;
    }

    static int suma_stream(int[] tablica) {
        return IntStream.of(tablica).sum();
    }


    static int sumaParzystych(int[] tablica) {
        int wynik = 0;

        for (int liczba : tablica) {
            if (liczba % 2 == 0) {
                wynik += liczba;
            }
        }

        return wynik;
    }

    static int sumaParzystych_stream(int[] tablica) {
        return IntStream.of(tablica)
                .filter(x -> x % 2 == 0)  // lambda expression
                .sum();
    }

    // Dla wygody maina testującego umieszczam w tym samym pliku
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 5, 10, 15};
        int[] b = {-20, 0, 5, 20};

        System.out.println("suma a : " + suma(a)); // 90
        System.out.println("suma b : " + suma(b)); // 5
        System.out.println();
        System.out.println("suma a : " + suma_inaczej(a)); // 90
        System.out.println("suma b : " + suma_inaczej(b)); // 5
        System.out.println();

        System.out.println("suma parzystych a : " + sumaParzystych(a)); // 70
        System.out.println("suma parzystych b : " + sumaParzystych(b)); // 0

    }

}
