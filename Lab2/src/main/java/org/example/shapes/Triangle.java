package org.example.shapes;


import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Triangle extends Shape{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c, Color color, ArrayList<Double> placement) {
        super(color,placement);
        if (!((a+b>c) && (a+c>b) && (b+c>a))) throw new RuntimeException("Not exist Triangle");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double square() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a && b == triangle.b && c == triangle.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return super.toString() + "\t\tTriangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
