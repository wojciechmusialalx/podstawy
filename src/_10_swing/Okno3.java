package _10_swing;

import javax.swing.*;
import java.awt.*;

public class Okno3 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setTitle("Nasze drugie okno");

        JLabel label = new JLabel("Ala ma kota");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 40));
        label.setForeground(Color.BLUE);

        // różne możliwości ustawiania kolorów
        // 1) użyć gotowej stałej
        //Color kolorTla = Color.YELLOW;

        // 2) podać wartości kolorów podstawowych RGB w zakresie od 0 do 1.0 jako float
        //Color kolorTla = new Color(1.0f, 1.0f, 0.5f);

        // 3) podać wartości kolorów podstawowych RGB w zakresie od 0 do 255 jako int
        //Color kolorTla = new Color(255, 255, 150);

        // 4) zakodować kolory skłądowe w jednej liczbie typu int
        // w taki sposób, że w systemie szesnastkowym mamy po dwie cyfry na kolor:
        // 0xRRGGBB  -  każdy kolor przyjmuje wartości od 00 do FF
        Color kolorTla = new Color(0xFFFF90);

        label.setOpaque(true);
        label.setBackground(kolorTla);

        frame.add(label);

        frame.setVisible(true);
    }
}
