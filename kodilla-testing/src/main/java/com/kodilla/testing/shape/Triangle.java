package com.kodilla.testing.shape;

public class Triangle implements Shape {
    public String getShapeName() {
        return "triangle";
    }
    public Double getField() {
        Double area = (0.5*10*10);
        return area;
    }
}