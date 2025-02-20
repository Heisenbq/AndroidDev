package org.example.shapes;

import java.awt.*;

public abstract class AbstractShape implements Shape, Movable,Colorable {

    private Color color;
    private java.util.List<Double> placement;

    public AbstractShape(Color color, java.util.List<Double> placement) {
        this.color = color;
        this.placement = placement;
    }
    @Override
    public void setColor(Color color) {
        this.color = color;
    };

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void move(Double x, Double y){
        placement.set(0,placement.get(0) + x);
        placement.set(1,placement.get(1) + y);
    }

    public java.util.List<Double> getPlacement() {
        return placement;
    }

    @Override
    public String toString() {
        return  "Площадь: "+ String.format("%.2f",square()) + "\tПериметр: " + String.format("%.2f",perimeter()) + "\tЦвет: " + getColor().toString();
    }
}
