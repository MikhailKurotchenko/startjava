package com.startjava.Lesson_2.wolf;

public class Wolf {

    private String sex = "Male";
    private String name = "Tuzik";
    private String color = "Grey";
    private int weight = 40;
    private int age = 4;

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        if(name == "") {
            System.out.println("Пустая строка");
        } else {
            this.name = name;
        }
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public void move() {

    }

    public void sit() {

    }

    public void run() {

    }

    public String hunt() {
        return "The wolf caught a hare";
    }

    public boolean howl() {
        System.out.println("Full moon in the sky");
        return true;
    }
}