package org.inspection.com;

public class body
{
    private  String name;
    private  int age;
    private char blood;
    private eyes Lefteyes;
    private eyes righteyes;

    public body(String name, int age, char blood, eyes lefteyes, eyes righteyes) {
        this.name = name;
        this.age = age;
        this.blood = blood;
        Lefteyes = lefteyes;
        this.righteyes = righteyes;
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

    public char getBlood() {
        return blood;
    }

    public void setBlood(char blood) {
        this.blood = blood;
    }

    public eyes getLefteyes() {
        return Lefteyes;
    }

    public void setLefteyes(eyes lefteyes) {
        Lefteyes = lefteyes;
    }

    public eyes getRighteyes() {
        return righteyes;
    }

    public void setRighteyes(eyes righteyes) {
        this.righteyes = righteyes;
    }

    protected void function(){
        System.out.println("dsjbnjdsaf");
    }
}
