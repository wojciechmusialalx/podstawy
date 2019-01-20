package _7_petle;

import java.util.OptionalInt;
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

    static int max(int[] tablica) {
        int wynik = Integer.MIN_VALUE;
        for(int x : tablica) {
            if(x > wynik) {
                wynik = x;
            }
        }
        return wynik;
    }

    // Klasyczne podejście do obsługi wartości "opcjonalnych"
    // Używamy klasy Integer zamiast typu int. null oznacza brak wyniku / brak wartości
    static Integer maxx(int[] tablica) {
        if(tablica.length == 0) {
            return null;
        }

        int wynik = tablica[0];
        for(int x : tablica) {
            if(x > wynik) {
                wynik = x;
            }
        }
        return wynik;
    }

    // Nowoczesne podejście do obsługi wartości "opcjonalnych"
    // Używamy wyspecjalizowanej klasy Optional, a dokładnie OptionalInt.
    // To jest "pudełko", w którym może być wartość, a może nie być.
    static OptionalInt maxxx(int[] tablica) {
        if(tablica.length == 0) {
            return OptionalInt.empty(); // puste pudełko
        }

        int wynik = tablica[0];
        for(int x : tablica) {
            if(x > wynik) {
                wynik = x;
            }
        }
        return OptionalInt.of(wynik); // pudełko zawierające wynik
    }


    // Dla wygody maina testującego umieszczam w tym samym pliku
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 5, 10, 15};
        int[] b = {-20, 0, 5, 20};
        int[] c = {-10, -20, -5, -10};
        int[] e = {};

        System.out.println("suma a : " + suma(a)); // 90
        System.out.println("suma b : " + suma(b)); // 5
        System.out.println();
        System.out.println("suma a : " + suma_inaczej(a)); // 90
        System.out.println("suma b : " + suma_inaczej(b)); // 5
        System.out.println();

        System.out.println("suma parzystych a : " + sumaParzystych(a)); // 70
        System.out.println("suma parzystych b : " + sumaParzystych(b)); // 0
        System.out.println();

        System.out.println("max a : " + max(a)); // 30
        System.out.println("max b : " + max(b)); // 20
        System.out.println("max c : " + max(c)); // -5
        System.out.println("max e : " + max(e));
        System.out.println();

        System.out.println("maxx a : " + maxx(a)); // 30
        System.out.println("maxx b : " + maxx(b)); // 20
        System.out.println("maxx c : " + maxx(c)); // -5
        System.out.println("maxx e : " + maxx(e));

        Integer wynik = maxx(e);
        if(wynik != null) {
            System.out.println("Wynik wynosi " + wynik);
        } else {
            System.out.println("Wyniku nie ma");
        }
        System.out.println();

        System.out.println("maxxx a : " + maxxx(a));
        System.out.println("maxxx b : " + maxxx(b));
        System.out.println("maxxx c : " + maxxx(c));
        System.out.println("maxxx e : " + maxxx(e));

        OptionalInt opt = maxxx(e);
        if(opt.isPresent()) {
            System.out.println("Wynik wynosi " + opt.getAsInt());
        } else {
            System.out.println("Wyniku nie ma");
        }
        // inny sposób domyślna wartość (jeśli tablica pusta, przyjmij wynik 0)
        System.out.println(opt.orElse(0));
    }

}
