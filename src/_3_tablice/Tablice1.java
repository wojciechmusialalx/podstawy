package _3_tablice;

public class Tablice1 {
    public static void main(String[] args) {
        int[] tablica = new int[8];

        System.out.println("Dlugosc tablicy: " + tablica.length);

        System.out.println("Element 3. tablicy: " + tablica[2]);

        //pojawia sie wtedy wyjatek
        //System.out.println("Element nieistniejacy: " + tablica[8]);

        tablica[0] = 178;

        System.out.println("Element 0: " + tablica[0]);

        int[] tablicaWypelniona = {178, 185, 189, 177};

        // i++ | i=i+1 | i+=1 (postinkrementacja)
        // ++i  (preinkrementacja)
        // i--
        // --i

        //     START             STOP                 KROK
        for (int i = 0; i < tablicaWypelniona.length; i++) {
            System.out.println(i + ": " + tablicaWypelniona[i]);
        }

        System.out.println();

        for (int i = tablicaWypelniona.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + tablicaWypelniona[i]);
        }

        System.out.println();

        for (int i = 0; i < tablicaWypelniona.length; i=i+2) {
            System.out.println(i + ": " + tablicaWypelniona[i]);
        }

        for (int tmp : tablicaWypelniona) {
            System.out.println(tmp);
        }

    }
}
