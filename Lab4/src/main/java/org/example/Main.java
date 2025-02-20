 package org.example;

 import javax.swing.*;
 import java.awt.*;

 public class Main {
     public static void main(String[] args) {
         JFrame f = new JFrame();
         f.setSize(800, 300); // Размер окна
         f.setLocation(800, 300); // Расположение окна

         JPanel panel = new JPanel(new FlowLayout());


         for (int i = 1; i < 20; i++) {
             panel.add(new JButton("Button" + i));
         }

         f.add(panel);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Закрытие окна при нажатии на крестик
         f.setVisible(true); // Сделать окно видимым
     }

 }
