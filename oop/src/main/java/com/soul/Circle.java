package com.soul;

public class Circle {
    double radius;

    public double getSquare(){
        double square = Math.PI * (radius * radius);
        return square;
    }

    public double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
