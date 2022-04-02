package com.soul.school;

public class Score {
    private int math;
    private int english;
    private int chinese;

    public Score(int math, int english, int chinese){
        this.math = math;
        this.english = english;
        this.chinese = chinese;
    }

    //getter and setter
    public int getMath() {
        return this.math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish(){
        return english;
    }

    public void setEnglish(int english){
        this.english = english;
    }

    public int getChinese(){
        return chinese;
    }

    public void setChinese(int chinese){
        this.chinese = chinese;
    }
}
