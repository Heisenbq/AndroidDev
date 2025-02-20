package org.example.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Circle implements Shape {
    private double r;
    private Color color;
    private java.util.List<Double> placement;

    public Circle(double r, Color color, ArrayList<Double> placement) {
        this.color = color;
        this.placement = placement;
        this.r = r;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(r,2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(r, circle.r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }

    @Override
    public String toString() {
        return super.toString() + "\t\tCircle{" +
                "r=" + r +
                '}';
    }
}
