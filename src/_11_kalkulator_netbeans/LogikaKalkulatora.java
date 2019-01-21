package _11_kalkulator_netbeans;

public class LogikaKalkulatora {
    public static double oblicz(double arg1, double arg2, String operacja) {
        switch(operacja) {
            case "+": return arg1 + arg2;
            case "-": return arg1 - arg2;
            case "*": return arg1 * arg2;
            case "/": return arg1 / arg2;
            default:  throw new IllegalArgumentException("Nieznana operacja: " + operacja);
        }
    }        
}
