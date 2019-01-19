package _8_funkcje;

public class KonwersjaJednostek {

    public static final double MILA = 1.609344;

    public static double mileNaKm(double mile) {
        return mile * MILA;
    }

    public static double kmNaMile(double km) {
        return km / MILA;
    }

    public static double c2f(double cel) {
        return 32.0 + (9.0 / 5.0) * cel;
    }

    public static double f2c(double far) {
        return (5.0 / 9.0) * (far - 32.0);
    }
}
