package org.example.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Line extends AbstractShape{

    private Double x2;
    private Double y2;

    public Line(Color color, double x1, double y1, double x2, double y2) {
        super(color,x1,y1);
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public double square() {

        return 0;
    }

    @Override
    public double perimeter() {
        return Math.sqrt(Math.pow(x2 - this.x1, 2) + Math.pow(y2 - this.y1, 2));
    }

    @Override
    public void move(Double dx, Double dy) {
        super.move(dx, dy);
        this.x2 += dx;
        this.y2 += dy;
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
        Line line = (Line) o;
        return Objects.equals(x2, line.x2) && Objects.equals(y2, line.y2) && Objects.equals(x1, line.x1) && Objects.equals(y1, line.y1);
    }


    @Override
    public int hashCode() {
        return Objects.hash(x1,y1,x2, y2);
    }

    @Override
    public String toString() {
        return super.toString() + "\t\tLine{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }
}
