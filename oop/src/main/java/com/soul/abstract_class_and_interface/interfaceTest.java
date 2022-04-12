package com.soul.abstract_class_and_interface;

import java.util.ArrayList;
import java.util.List;

public class interfaceTest {
    public static void main(String[] args) {
        Flyable flyable1 = new Bird();
        Flyable flyable2 = new Plane();

        flyable1.fly();
        flyable2.fly();

        List list = new ArrayList();

        Plane plane = new Plane();

    }



}

interface Flyable {

    void fly();

}

class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("buda buda");
    }

}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("xiu xiu");
    }

}

