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
        AbstractShape[] shape = {
                new Rectangle(Color.BLACK, 0,0,0,4,3,4,3,0),
                new Rectangle(Color.BLACK, 0,0,0,5,4,5,4,0),
                new Rectangle(Color.BLACK, 1,1,1,6,5,6,5,1),
                new Triangle(Color.GREEN, 0,0,3,0,1,2),
                new Triangle(Color.GREEN, -2,-3,2,-1,0,4),
                new Triangle(Color.GREEN, 1,1,4,5,7,2),
                new Circle(Color.WHITE, 0,0,3,4),
                new Circle(Color.WHITE, 0,0,6,8),
                new Circle(Color.WHITE, 0,0,5,5),
                new Line(Color.RED,0,0,5,0),
                new Line(Color.RED,0,0,0,10),
                new Line(Color.cyan,0,0,6,8)
        };

        ArrayList<AbstractShape> shapes = new ArrayList<>();
        for(AbstractShape sh: shape) {
            if(!shapes.contains(sh)){
                shapes.add(sh);
            }
        }
        AtomicInteger index = new AtomicInteger(0);

        shapes.stream().
                forEach( example -> {
                    System.out.println("Index: " + index.getAndIncrement() + "\t" + example.toString());
                });
    }
}

