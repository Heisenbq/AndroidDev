package org.example.PaintApp;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;


public class PaintFrame extends JFrame {
    private final DrawPanel drawPanel;

    public PaintFrame() {
        setTitle("Paint");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        // Панель для рисования
        drawPanel = new DrawPanel();
        add(drawPanel, BorderLayout.CENTER);

        // Панель с кнопками выбора цвета
        JPanel colorPanel = new JPanel();
        List<String> colors = Arrays.asList("Black", "Red", "Green", "Dark Blue","Light Blue","Orange","Yellow", "Purple");
        List<Color> colorValues = Arrays.asList(Color.BLACK, Color.RED, Color.GREEN, Color.BLUE, new Color(51,204,255), Color.ORANGE,Color.YELLOW, new Color(128,0,128));

        Integer thickness = 2;
        JPanel toolsPanel = new JPanel();
        JSlider thicknessSlider = new JSlider(1, 20, 5); // От 1 до 20, по умолчанию 5
        thicknessSlider.setMajorTickSpacing(5);
        thicknessSlider.setMinorTickSpacing(1);
        thicknessSlider.setPaintTicks(true);
        thicknessSlider.setPaintLabels(true);
        thicknessSlider.addChangeListener(e -> drawPanel.setThickness(thicknessSlider.getValue()));
        toolsPanel.add(new JLabel("Thickness:"));
        toolsPanel.add(thicknessSlider);
        JButton eraseButton = new JButton("eraser");
        eraseButton.addActionListener(e -> drawPanel.setCurrentColor(Color.white));
        toolsPanel.add(eraseButton);
        add(toolsPanel,BorderLayout.NORTH);


        for (int i = 0; i < colors.size(); i++) {
            JButton button = new JButton(colors.get(i));
            Color color = colorValues.get(i);
            button.addActionListener(e -> drawPanel.setCurrentColor(color));
            colorPanel.add(button);
        }

        add(colorPanel, BorderLayout.SOUTH);
        setVisible(true);
    }
}
