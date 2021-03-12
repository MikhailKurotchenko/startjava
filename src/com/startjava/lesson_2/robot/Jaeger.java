package com.startjava.lesson_2.robot;


public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strengh;
    private int armor;

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strengh, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strengh = strengh;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrengh() {
        return strengh;
    }

    public int getArmor() {
        return armor;
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы сделали 5 шагов");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVortexCannon() {

    }
}