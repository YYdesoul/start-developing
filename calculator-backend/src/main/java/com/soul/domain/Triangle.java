package com.soul.domain;

public class Triangle {
    private double edge;
    private double height;

    public Triangle() {

    }

    public Triangle (double edge, double height) {
        this.edge = edge;
        this.height = height;
    }

    public double getEdge() {
        return edge;
    }

    public double getHeight() {
        return height;
    }

    public void setEdge (double edge) {
        this.edge = edge;
    }

    public void setHeight (double height) {
        this.height = height;
    }

}
