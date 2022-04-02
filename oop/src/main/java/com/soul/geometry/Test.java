package com.soul.geometry;

public class Test {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 4);
        System.out.println(rectangle1.length);

        Rectangle rectangle2 = new Rectangle(15, 20);
        System.out.println(rectangle2.getArea());

        new Rectangle(10, 10);
        Rectangle rectangle3 = new Rectangle(20);

        Rectangle rectangle4 = new Rectangle();
        System.out.println(rectangle4.getArea());

        int a = 5;
        System.out.println("a: " + a);
        a = 10;
        System.out.println("a: " + a);

    }
}
