package com.kodilla.testing.shape;

public class Circle implements Shape {

    public String getShapeName(){
        return "circle";
    }
    public Double getField(){
        Double area = (2*3.14*10);
        return area;
    }

}
