package _8_funkcje;

public class Parametry2 {
    static void m1(String s, StringBuilder b) {
        System.out.println(s + ", " + b);
        s += " ma kota";
        b.append(" ma psa");
        System.out.println(s + ", " + b);
    }

    public static void main(String[] args) {
        String napis = "Ala";
        StringBuilder builder = new StringBuilder("Ola");

        System.out.println(napis + ", " + builder);
        m1(napis, builder);
        System.out.println(napis + ", " + builder);
    }
}

/* O niektórych klasach mówi się, że są "immutable" (polscy programiści mówią "niemutowalne").
   Oznacza to, że w konkretnym, utworzonym obiekcie nie da się zmienić wartości ("w środku obiektu").
   Stan obiektu jest niezmienny. Natomiast można tworzyć nowe obiekty tych klas.

   Dzięki temu przekazując taki obiekt jako parametr do innej metody mamy 100% pewność,
   że metoda nie zmieni nam tego obiektu.
   Przykłady takich klas:
    * String
    * Integer, Long, Double i inne "wrappery"
    * BigDecimal i BigInteger
    * LocalDate, LocalTime i inne klasy z java.time
    * wiele klas tworzonych przez świadomych programistów (istotna rola modyfikatora final).

   Oczywiście niektóre klasy powinny być mutowalne, bo inaczej nie miałyby sensu.
   Przykłady: StringBuilder, AtomicInteger, ArrayList i inne kolekcje, większość klas związanych z wejściem/wyjściem, np. Scanner.
*/
