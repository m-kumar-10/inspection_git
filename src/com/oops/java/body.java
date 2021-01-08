package com.oops.java;

public class body
{
     private String  name;
     private  int age;
     private float height;
     private Heart heart;
     private  Stomach stomach;
     private  skin skin;
    private Eyes leftEys;
    private Eyes rightEys;

    public body(String name, int age, float height, Heart heart, Stomach stomach, com.oops.java.skin skin, Eyes leftEys, Eyes rightEys) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
        this.leftEys = leftEys;
        this.rightEys = rightEys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public com.oops.java.skin getSkin() {
        return skin;
    }

    public void setSkin(com.oops.java.skin skin) {
        this.skin = skin;
    }

    public Eyes getLeftEys() {
        return leftEys;
    }

    public void setLeftEys(Eyes leftEys) {
        this.leftEys = leftEys;
    }

    public Eyes getRightEys() {
        return rightEys;
    }

    public void setRightEys(Eyes rightEys) {
        this.rightEys = rightEys;
    }
}
