 package org.example;

 import javax.swing.*;
 import java.awt.*;

 public class Main {
     public static void main(String[] args) {
         JFrame f = new JFrame();
         f.setSize(800, 300); // Размер окна
         f.setLocation(800, 300); // Расположение окна
         f.setLayout(new FlowLayout()); // Использование FlowLayout для правильного расположения компонентов

         JLabel lab1 = new JLabel("Some text1");
         JLabel lab2 = new JLabel("Some text2");

         f.add(lab1); // Добавить первый JLabel
         f.add(lab2); // Добавить второй JLabel

         JPanel p = new JPanel(); // Панель для кнопки
         JButton button = new JButton("Button");
         p.add(button); // Добавить кнопку на панель
         f.add(p); // Добавить панель с кнопкой на окно

         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Закрытие окна при нажатии на крестик
         f.setVisible(true); // Сделать окно видимым
     }

 }
