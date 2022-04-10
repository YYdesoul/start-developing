package com.soul.oop_practice;

/**
 * 第一天创造了光，上帝说：“要有光！”便有了光。上帝将光与暗分开，称光为昼，称暗为夜。于是有了白天和夜晚。
 *
 * 第二天创造了空气，上帝说：“诸水之向要有空气隔开。”称它为天。
 *
 * 第三天创造了海洋，上帝说：“普天之下的水要聚在一处，使旱地露出来。”水和旱地便分开。上帝称旱地为大陆，称众聚集的地方叫海洋。
 *
 * 第四天创造了星辰，上帝说：“天上要有光体，可以分管昼夜，作记号，定节令、日子、年岁，并要发光普照全地。”于是上帝造就了太阳与月亮以及无数的星斗。
 *
 * 第五天创造了水中的生命和飞鸟，上帝说，“水要多多滋生有生命之物，要有雀鸟在地面天空中飞翔。”于是上帝创造出鱼类和鸟类让它们繁衍生存。
 *
 * 第六天创造了地上的生灵和人，上帝说：“地要生出活物来；牲畜、昆虫、野兽各从其类。”于是，上帝造出了地上的生灵，使它们各自归入自己的类别。上帝又说：“我要照着我的形象和样式造人，派他们去管理海里的鱼、空中的鸟、地上的牲畜和地上爬行的一切昆虫。”上帝就照着自己的形象创造了人。
 *
 * 第七天天地万物已经造齐了，上帝歇息了，并给第六天赐福，圣化第六天为特别的日子，因为上帝是在第七天完成了创造并休息。于是星期日也成为人类休息的日子。
 */

public class CreateWorld {
    public static void main(String[] args) {
       God god = new God("bt");
       god.createWorld();
       Person person1 = new Person("Mike", "male");
       person1.createBaby(new Person("Jane", "female"));
       person1.breed(100, new Person("Jane", "female"));

    }
}

class Light {

}

class Air {

}

class Ocean {

}

class Star {

}

class Fish {

}

class Bird {

}

class Animal {

}

class Person {
    private String name;
    private String gender;

    public Person() {

    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person createBaby (Person person) {
        if ((this.gender.equals("male") && person.gender.equals("female")) ||
                (this.gender.equals("female") && person.gender.equals("male"))) {
            System.out.println("start creating a baby");
            return new Person();
        }
        else {
            System.out.println("can't create a baby");
            return null;
        }
    }

    public Person[] breed (int breedNumber, Person breedPartner){
            Person[] babies = new Person[breedNumber];
            for (int i = 0; i < breedNumber; i++){
               babies[i] = createBaby(breedPartner);
            }
            return babies;
    }
}

class God {
    private String name;

    public God() {

    }

    public God(String name) {
        this.name = name;
    }

    public void createWorld(){
        Light light = new Light();
        System.out.println("light " + light.toString() + " is created.");
        Air air = new Air();
        System.out.println("air " + air.toString() + " is created.");
        Ocean ocean = new Ocean();
        System.out.println("ocean " + ocean.toString() + " is created.");

        Star star = new Star();
        System.out.println("star " + star.toString() + " is created.");

        Fish fish = new Fish();
        System.out.println("fish " + fish.toString() + " is created.");

        Bird bird = new Bird();
        System.out.println("bird " + bird.toString() + " is created.");

        Animal animal = new Animal();
        System.out.println("animal " + animal.toString() + " is created.");

        Person adam = new Person("Adam", "male");
        System.out.println("adam " + adam.toString() + " is created.");

        Person eva = new Person();
        eva.setName("Eva");
        eva.setGender("female");
        System.out.println("eva " + eva.toString() + " is created.");

        pause();

    }

    public void pause() {
        System.out.println("Have a break");
    }
}