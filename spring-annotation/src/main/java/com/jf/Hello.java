package com.jf;

/**
 * @author 潇潇暮雨
 * @create 2019-07-30   20:48
 */

class A {

}

class B extends A {

}

public class Hello {

    private String name;

    public Hello() {

    }

    public Hello(String name) {
        // this();
        this.name = name;
    }

    public static void main(String[] args) {
        Hello jf = new Hello("jf");
        System.out.println(jf.name);
    }
}
