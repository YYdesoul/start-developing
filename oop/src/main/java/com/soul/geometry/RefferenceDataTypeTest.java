package com.soul.geometry;

public class RefferenceDataTypeTest {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(2,5);
        Triangle triangle2 = triangle1;
        triangle2.height = 10;
        System.out.println(triangle1.height);

        int num1 = 5;
        int num2 = 10;
        num2 = num1;
        System.out.println(num2);
        num1 = 8;
        System.out.println(num2);
    }
}
