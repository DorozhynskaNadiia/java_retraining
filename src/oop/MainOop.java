package oop;

import object_oriented.MyRandomNumber;

public class MainOop {
    public static void main(String[] args) {
        Generator g = GeneratorFactory.get(System.getProperty("generator"));
        MyRandomNumber n = new MyRandomNumber(g);
        System.out.println(n.isHappy());
    }
}
