package com.soul.polymorphism;


public class polymorphismTest {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();
        Animal animal4 = new Person();

        animal1.sayHello();
        animal2.sayHello();
        animal3.sayHello();
        animal4.sayHello();

    }
}

class Animal {

    public void sayHello() {
        System.out.println("Mmm");
    }
}

class Dog extends Animal{

    @Override
    public void sayHello() {
        System.out.println("Wang Wang");
    }
}

class Cat extends  Animal{

    @Override
    public void sayHello() {
        System.out.println("Miao Miao");
    }
}


class Person extends Animal {

}