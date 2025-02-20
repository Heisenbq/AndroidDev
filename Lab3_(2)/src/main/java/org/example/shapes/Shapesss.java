package org.example.shapes;

import java.awt.*;

public abstract class Shapesss {

    private Color color;
    private java.util.List<Double> placement;

    public Shapesss(Color color, java.util.List<Double> placement) {
        this.color = color;
        this.placement = placement;
    }
    public Shapesss() {
    }
    public abstract double square();
    public abstract double perimeter();

    public void setColor(Color color) {
        this.color = color;
    };

    public Color getColor() {
        return color;
    }

    public void move(Double x, Double y){
        placement.set(0,placement.get(0) + x);
        placement.set(1,placement.get(1) + y);
    }

    public java.util.List<Double> getPlacement() {
        return placement;
    }

    @Override
    public String toString() {
        return  "Площадь: "+ String.format("%.2f",square()) + "\tПериметр: " + String.format("%.2f",perimeter()) + "\tЦвет: " + getColor().toString();
    }
}
