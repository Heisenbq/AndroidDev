package org.example.testCompacts;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest {
    public BorderLayoutTest() {
        JFrame f = new JFrame();
        f.setSize(800, 300); // Размер окна
        f.setLocation(800, 300); // Расположение окна


        JPanel panel = new JPanel(new BorderLayout());


        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");

        panel.add(button1,BorderLayout.CENTER);
        panel.add(button2,BorderLayout.EAST);
        panel.add(button3,BorderLayout.WEST);
        panel.add(button4, BorderLayout.NORTH);
        panel.add(button5,BorderLayout.SOUTH);



        f.add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Закрытие окна при нажатии на крестик
        f.setVisible(true); // Сделать окно видимым
    }
}
