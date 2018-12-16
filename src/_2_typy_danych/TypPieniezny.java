package _2_typy_danych;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TypPieniezny {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("3.0");

        BigDecimal suma = a.add(b);
        BigDecimal roznica = a.subtract(b);
        BigDecimal iloczyn = a.multiply(b).setScale(2, RoundingMode.HALF_UP);
        BigDecimal iloraz = a.divide(b, 2, RoundingMode.HALF_UP);

        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(iloczyn);
        System.out.println(iloraz);
    }
}
