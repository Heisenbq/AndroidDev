package org.example.testCompacts;

import javax.swing.*;

public class GridLayoutTest {
    public GridLayoutTest() {
        JFrame f = new JFrame("GridLayout в JPanel");
        f.setSize(800, 300);
        f.setLocation(800, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel(new java.awt.GridLayout(4, 5, 5, 5));




        for (int i = 1; i <= 20; i++) {
            panel.add(new JButton("Button " + i));
        }


        // Добавляем главную панель в окно
        f.add(panel);
        f.setVisible(true);
    }
}
