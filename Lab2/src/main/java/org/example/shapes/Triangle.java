package org.example.shapes;


import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Triangle extends Shape{
    private Double x2,y2,x3,y3;
    private final Double sideA;
    private final Double sideB;

    private final Double sideC;

    public Triangle(Color color, double x1, double y1, double x2, double y2, double x3, double y3) {
        super(color,x1,y1);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = y3;
        this.y3 = y3;
        sideA = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        sideB = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        sideC = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        if (!((sideA+sideB > sideC) && (sideA+sideC > sideB) && (sideB+sideC>sideA))) throw new RuntimeException("Not exist Triangle");
    }

    @Override
    public double square() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double perimeter() {
        return sideA+sideB+sideC;
    }

    public Double getX2() {
        return x2;
    }

    public Double getY2() {
        return y2;
    }

    public Double getX3() {
        return x3;
    }

    public Double getY3() {
        return y3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(x2, triangle.x2) && Objects.equals(y2, triangle.y2) && Objects.equals(x3, triangle.x3) && Objects.equals(y3, triangle.y3) && Objects.equals(x1, triangle.x1) && Objects.equals(y1, triangle.y1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x2, y2, x3, y3,x1,y1);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "x2=" + x2 +
                ", y2=" + y2 +
                ", x3=" + x3 +
                ", y3=" + y3 +
                ", x1=" + x1 +
                ", y1=" + y1 +
                '}';
    }
}
