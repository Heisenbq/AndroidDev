package org.example.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Rectangle implements Shape {
    private double a;
    private double b;
    private double c;
    private double d;
    private Color color;
    private java.util.List<Double> placement;

    public Rectangle(double a, double b, double c, double d, Color color, ArrayList<Double> placement) {
        this.color = color;
        this.placement = placement;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double square() {
        double p = perimeter() / 2;
        return Math.sqrt((p-a)*(p-b)*(p-c)*(p-d));
    }

    @Override
    public double perimeter() {
        return (a+b+c+d);
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

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(a, rectangle.a) == 0 && Double.compare(b, rectangle.b) == 0 && Double.compare(c, rectangle.c) == 0 && Double.compare(d, rectangle.d) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, d);
    }

    @Override
    public String toString() {
        return super.toString() + "\t\tRectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
