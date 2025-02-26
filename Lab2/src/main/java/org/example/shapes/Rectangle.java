package org.example.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Rectangle extends Shape{
    private Double x2, y2, x3, y3, x4, y4; // Четыре вершины прямоугольника
    public Rectangle(Color color, double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(color,x1, y1);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    @Override
    public double square() {
        double width = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));  // Ширина
        double height = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));  // Высота
        return width * height;
    }

    @Override
    public double perimeter() {
        double width = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));  // Ширина
        double height = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));  // Высота
        return 2 * (width + height);
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

    public Double getX4() {
        return x4;
    }

    public Double getY4() {
        return y4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return  Objects.equals(x1, rectangle.x1) && Objects.equals(y1, rectangle.y1) && Objects.equals(x2, rectangle.x2) && Objects.equals(y2, rectangle.y2) && Objects.equals(x3, rectangle.x3) && Objects.equals(y3, rectangle.y3) && Objects.equals(x4, rectangle.x4) && Objects.equals(y4, rectangle.y4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x2, y2, x3, y3, x4, y4,x1,y1);
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle{" +
                "x2=" + x2 +
                ", y2=" + y2 +
                ", x3=" + x3 +
                ", y3=" + y3 +
                ", x4=" + x4 +
                ", y4=" + y4 +
                '}';
    }
}
