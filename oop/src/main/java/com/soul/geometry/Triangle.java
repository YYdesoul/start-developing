package com.soul.geometry;

public class Triangle {
    double edge;
    double height;

    public Triangle(double edge, double height){
        this.edge = edge;
        this.height = height;
    }

    public double getArea(){
        double area = (edge * height) /  2;
        return area;
    }
}
