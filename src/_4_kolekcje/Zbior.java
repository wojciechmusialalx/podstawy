package _4_kolekcje;


import java.util.*;

public class Zbior {
    public static void main(String[] args) {
        Set<String> numeryPesel = new HashSet<>();

        numeryPesel.add("72728288281");
        numeryPesel.add("72728288121");
        numeryPesel.add("72728298347");
        numeryPesel.add("72728212312");
        numeryPesel.add("72728288121");

        System.out.println(numeryPesel);

        numeryPesel.remove("72728288281");

        System.out.println(numeryPesel);

        if (numeryPesel.contains("72728288281")) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }

        Set<String> posortowany = new TreeSet<>();

        posortowany.addAll(numeryPesel);

        System.out.println(posortowany);

        Set<String> kolejnosc = new LinkedHashSet<>();

        kolejnosc.add("Wojciech");
        kolejnosc.add("Marcin");
        kolejnosc.add("Tomek");

        System.out.println(kolejnosc);

    }
}
