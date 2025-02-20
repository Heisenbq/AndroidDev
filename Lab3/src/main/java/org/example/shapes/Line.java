package org.example.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Line extends AbstractShape {

    private double a;

    public Line(double a, Color color, ArrayList<Double> placement) {
        super(color,placement);
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
