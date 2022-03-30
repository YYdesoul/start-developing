package com.soul;

public class Rectangle {

    double length = 10;
    double breadth = 24;

    public Rectangle(){

    }

    public Rectangle(int length) {
        this.length = length;
        this.breadth = 5;
    }

    /**
     *     局部变量和全球变量
     *     1. 局部变量：作用域只在方法内，定义在方法内
     *     2. 全球变量：作用域为整个类,定义在方法外
     *     3. 在一个方法内，直接使用重名的变量就是局部变量
     *     4. 如果在方法内想使用重名的全球变量，那么使用this关键字
     */
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea(){
        double area = length * breadth;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * (length + breadth);
        return perimeter;
    }
}
