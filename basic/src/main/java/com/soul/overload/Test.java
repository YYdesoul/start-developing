package com.soul.overload;

public class Test {
    public static void main(String[] args) {
        String s = "hello world";
        int count = 2;
        // 注释
        saySomething(count);
        saySomething();
    }

    public static void saySomething(String words) {
        System.out.println(words);
    }

    public static void saySomething(int num) {
        System.out.println("you said " + num + " words");
    }

    public static void saySomething() {
        System.out.println("Say nothing");
    }

}
