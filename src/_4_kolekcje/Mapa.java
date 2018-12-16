package _4_kolekcje;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapa {
    public static void main(String[] args) {
        Map<String, Integer> inwentarz = new TreeMap<>();

        inwentarz.put("Mysz", 4);
        inwentarz.put("Glosniki", 10);
        inwentarz.put("Monitor" , 2);

        System.out.println(inwentarz);

        inwentarz.put("Mysz", 10);

        System.out.println(inwentarz);

        System.out.println("Stan glosnikow: " + inwentarz.get("Glosniki"));

        System.out.println(inwentarz.values());

        System.out.println("Stan: " + inwentarz.get("XX"));

        int suma = 0;

        for (String klucz : inwentarz.keySet()) {
            suma = suma + inwentarz.get(klucz);
        }

        System.out.println("suma produktow: " + suma);

    }
}
