package _4_kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        List<String> imiona = new ArrayList<>();

        imiona.add("Wojciech");
        imiona.add("Justyna");
        imiona.add("Marcin");
        imiona.add("Sylwia");

        System.out.println(imiona);

        System.out.println("Rozmiar: " + imiona.size());

        System.out.println("Pozycja 1: " + imiona.get(1));

        for (String imie : imiona) {
            if (imie.endsWith("a")) {
                System.out.println(imie);
                break;
            }
        }

        imiona.remove("Marcin");

        System.out.println(imiona);

        if (imiona.contains("Justyna")) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }

//        imiona.sort();
        Collections.sort(imiona);

        System.out.println(imiona);



    }
}
