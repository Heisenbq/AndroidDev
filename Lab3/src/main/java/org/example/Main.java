package org.example;

import org.example.shapes.*;
import org.example.shapes.Rectangle;
import org.example.shapes.AbstractShape;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractShape> shapes = new ArrayList<>(Arrays.asList(
                new Rectangle(4, 4, 4, 4, Color.BLACK, new ArrayList<>(Arrays.asList(0.0, 0.0))),
                new Rectangle(3, 5, 3, 5, Color.RED, new ArrayList<>(Arrays.asList(0.0, 0.0))),
                new Rectangle(8, 5, 8, 5, Color.GRAY, new ArrayList<>(Arrays.asList(0.0, 0.0))),
                new Triangle(3, 4, 5, Color.GREEN, new ArrayList<>(Arrays.asList(0.0, 0.0))),
                new Triangle(6, 8, 10, Color.BLUE, new ArrayList<>(Arrays.asList(0.0, 0.0))),
                new Triangle(6, 6, 9, Color.YELLOW, new ArrayList<>(Arrays.asList(0.0, 0.0))),
                new Circle(3, Color.WHITE, new ArrayList<>(Arrays.asList(0.0, 0.0))),
                new Circle(5, Color.PINK, new ArrayList<>(Arrays.asList(0.0, 0.0))),
                new Circle(12, Color.BLACK, new ArrayList<>(Arrays.asList(0.0, 0.0))),
                new Line(1, Color.RED, new ArrayList<>(Arrays.asList(0.0, 0.0))),
                new Line(3, Color.DARK_GRAY, new ArrayList<>(Arrays.asList(0.0, 0.0))),
                new Line(6, Color.ORANGE, new ArrayList<>(Arrays.asList(0.0, 0.0)))
        ));

        AtomicInteger index = new AtomicInteger(0);

        shapes.stream().
                forEach( shape -> {
                    System.out.println("Iндекс: " + index.getAndIncrement() + "\t"+shape.toString());
                });
    }
}

