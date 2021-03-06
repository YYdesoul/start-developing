package com.soul.school;

public class Student {
    private String name;
    private String gender;
    private int age;
    private Score score;

    public Student(String name, String gender, int age, Score score){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.score = score;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Score getScore(){
        return score;
    }

    public void setScore(Score score){
        this.score = score;
    }


}


