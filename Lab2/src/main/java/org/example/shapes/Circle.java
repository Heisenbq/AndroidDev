package org.example.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Circle extends Shape{
    private Double x2,y2;

    private final Double radius;

    public Circle(Color color, double x1, double y1, double x2, double y2) {
        super(color,x1,y1);
        this.x2 = x2;
        this.y2 = y2;
        radius = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public Double getX2() {
        return x2;
    }

    public Double getY2() {
        return y2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(x2, circle.x2) && Objects.equals(y2, circle.y2) && Objects.equals(x1, circle.x1) && Objects.equals(y1, circle.y1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x2, y2,x1,y1);
    }

    @Override
    public String toString() {
        return super.toString()+ "\tCircle{" +
                "x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }
}
