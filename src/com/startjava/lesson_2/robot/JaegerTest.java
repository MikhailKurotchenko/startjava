package com.startjava.lesson_2.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jager1 = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.980f, 7, 8, 6);
        Jaeger jager2 = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 2.312f, 5, 7, 4);

        System.out.println(jager1.getModelName());
        System.out.println(jager1.getMark());
        System.out.println(jager1.getOrigin());
        System.out.println(jager1.getHeight());
        System.out.println(jager1.getWeight());
        System.out.println(jager1.getSpeed());
        System.out.println(jager1.getStrengh());
        System.out.println(jager1.getArmor());
        System.out.println("");
        System.out.println(jager2.getModelName());
        System.out.println(jager2.getMark());
        System.out.println(jager2.getOrigin());
        System.out.println(jager2.getHeight());
        System.out.println(jager2.getWeight());
        System.out.println(jager2.getSpeed());
        System.out.println(jager2.getStrengh());
        System.out.println(jager2.getArmor());
    }
}