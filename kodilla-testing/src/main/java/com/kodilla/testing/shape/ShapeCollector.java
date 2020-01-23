package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.Objects;

public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> figures =  new ArrayList<Shape>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;

    }
    public void addFigure(Shape shape) {
        figures.add(shape);
        this.shape.getShapeName();
        this.shape.getField();
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(figures.contains(shape)){
            figures.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n) {
        Shape shape = null;
        if(n>=0 && n<figures.size()){
            shape = figures.get(n);
        }
        return shape;
    }
    public void showFigure() {
        System.out.println(figures);
    }
}
