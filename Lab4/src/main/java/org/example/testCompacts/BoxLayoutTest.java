package org.example.testCompacts;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutTest {
    public BoxLayoutTest() {
        JFrame f = new JFrame("BoxLayout в JPanel");
        f.setSize(400, 500);
        f.setLocation(800, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        for (int i = 1; i <= 100; i++) {
            JButton button = new JButton("Button " + i);
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
            buttonPanel.add(button);
            buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        }

        JScrollPane scrollPane = new JScrollPane(buttonPanel);


        f.add(scrollPane, BorderLayout.CENTER);
        f.setVisible(true);
    }
}
