package org.example.PaintApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class DrawPanel extends JPanel {
    private ArrayList<ArrayList<Point>> lines = new ArrayList<>();
    private ArrayList<Color> colors = new ArrayList<>();
    private ArrayList<Integer> thicknesses = new ArrayList<>();
    private Color currentColor = Color.BLACK;

    private Integer thickness = 5;

    public DrawPanel() {
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                lines.add(new ArrayList<>()); // Создаем новую линию
                colors.add(currentColor);
                thicknesses.add(thickness);
            }
        });


        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (!lines.isEmpty()) {
                    lines.get(lines.size() - 1).add(e.getPoint()); // Добавляем точку в текущую линию
                    repaint(); // Перерисовываем
                }
            }
        });
    }

    public void setCurrentColor(Color color) {
        currentColor = color;
    }

    public void setThickness(Integer thickness) {
        this.thickness = thickness;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        // Устанавливаем толщину линии в 5 пикселей

        for (int i = 0; i < lines.size(); i++) {
            ArrayList<Point> line = lines.get(i);
            g2.setColor(colors.get(i));
            g2.setStroke(new BasicStroke(thicknesses.get(i), BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            for (int j = 1; j < line.size(); j++) {
                g2.drawLine(line.get(j - 1).x, line.get(j - 1).y, line.get(j).x, line.get(j).y);
            }
        }
    }

}
