package org.example.shapes;

import java.awt.*;

public abstract class AbstractShape implements Colorable, Movable,Shape{

    private Color color;
    protected Double x1;
    protected Double y1;

    public AbstractShape(Color color, double x1, double y1) {
        this.color = color;
        this.x1 = x1;
        this.y1 = y1;
    }
    public AbstractShape() {
    }
    public abstract double square();
    public abstract double perimeter();

    public void fill(Color color) {
        this.color = color;
    };

    public Color getColor() {
        return color;
    }

    public void move(Double dx, Double dy){
        this.x1 += dx;
        this.y1 += dy;
    }

    public Double getX1() {
        return x1;
    }

    public Double getY1() {
        return y1;
    }

    @Override
    public String toString() {
        return  "Площадь: "+ String.format("%.2f",square()) + "\tПериметр: " + String.format("%.2f",perimeter()) + "\tЦвет: " + getColor().toString();
    }
}

