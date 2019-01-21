package _8_funkcje;

import static _8_funkcje.KonwersjaJednostek.*;

public class TestyJednostek {

    public static void main(String[] args) {
        System.out.println("100 mil = " + mileNaKm(100.0) + " km" );
        System.out.println("2 mile = " + mileNaKm(2.0) + " km" );
        System.out.println();

        System.out.println("160 km = " + kmNaMile(160.0) + " mil" );
        System.out.println("10 km = " + kmNaMile(10.0) + " mil" );
        System.out.println();

         System.out.println("0 C = " + c2f(0.0) + " F" );
         System.out.println("100 C = " + c2f(100.0) + " F" );
         System.out.println("37 C = " + c2f(37.0) + " F" );

         System.out.println("0 F = " + f2c(0.0) + " C" );
         System.out.println("100 F = " + f2c(100.0) + " C" );
         System.out.println("32 F = " + f2c(32.0) + " C" );

    }
}
