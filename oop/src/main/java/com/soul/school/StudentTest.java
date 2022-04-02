package com.soul.school;

public class StudentTest {
    public static void main(String[] args) {
        Score score1 = new Score(60, 40, 30);
        Student student1 = new Student("Mike", "male", 10, score1);
//        System.out.println(student1.name);
        System.out.println(student1.getScore().getMath());
        student1.getScore().setMath(19);
        System.out.println(student1.getScore().getMath());
        Score score2 = new Score(70, 70, 70);
        student1.setScore(score2);
        System.out.println(student1.getScore().getMath());
        Student captain = student1;
        System.out.println(captain.getName());
        captain.setName("Leo");
        System.out.println(student1.getName());
    }


}


