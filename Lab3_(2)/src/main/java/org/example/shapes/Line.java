package org.example.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Line implements Shape {

    private double a;
    private Color color;
    private java.util.List<Double> placement;

    public Line(double a, Color color, ArrayList<Double> placement) {
        this.color = color;
        this.placement = placement;
        this.a = a;
    }

    @Override
    public double square() {
        return 0;
    }

    @Override
    public double perimeter() {
        return a;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Double.compare(a, line.a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

    @Override
    public String toString() {
        return super.toString() + "\t\tLine{" +
                "a=" + a +
                '}';
    }
}
