package org.inspection.com;

import java.util.Scanner;

public class Main {


        public static void main (String[]args)
        {
            int i;

            body dev = new body("Dev", 21, 'B',
                    new eyes("Blue", "Myopia", true),
                    new eyes("Blue", "Normal", true));
            Scanner input = new Scanner(System.in);
            System.out.println(dev.getName()+"\n"+dev.getAge()
            +"\n"+dev.getBlood() +"\n");
            dev.function();
            for (; ; ) {
                System.out.print("\npress 1 for inspect");
                System.out.println(" \t\t\tpress 0 to exit");
                if (input.nextInt() == 1) {
                    System.out.println("1>> for eyes" +
                            "\n2>> for stomach" +
                            "\n3>> for skin");
//                i=input.nextInt();
                    switch (input.nextInt()) {
                        case (1): {
                            System.out.println("type which eyes to be inspected " +
                                    "either Left" +
                                    "or Right");
                            if (input.next().equals("Left"))
                            { System.out.println("Left eye Colour:" + dev.getLefteyes().getColor());
                            System.out.println("Condition:" + dev.getLefteyes().getCondition());
                            dev.getLefteyes().function();
                            }
                            else
                            { System.out.println("Right eye Colour:" + dev.getRighteyes().getColor());
                                System.out.println("Condition:" + dev.getRighteyes().getCondition());
                                dev.getRighteyes().function();
                            }
                        }
                    }
                }
                else if (input.nextInt() == 0)
                    break;
            }

        }
    }


//
//package org.inspection.com;
//
//public class eyes {
//    private  String color;
//    private String Condition;
//    private Boolean isOpen;
//
////    This is constructor for eyes class.
//
//
//    public eyes(String color, String condition, Boolean isOpen)
//    {
//        this.color = color;
//        Condition = condition;
//        this.isOpen = isOpen;
//    }
////    providing getter and setter for eyes class
//
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getCondition() {
//        return Condition;
//    }
//
//    public void setCondition(String condition) {
//        Condition = condition;
//    }
//
//    public Boolean getOpen() {
//        return isOpen;
//    }
//
//    public void setOpen(Boolean open) {
//        isOpen = open;
//    }
//
//    /**
//     * this function will control
//     * eyes opening or closing
//     * this should be used for both eyes.
//     *
//     */
//    public void function()
//    {
//        if (!isOpen)
//        {
//            System.out.println("\t\t\t\t Eyes is opening");
//            isOpen=true;
//        }
//        else
//        {
//            System.out.println("\t\t\t\t Eyes is closing");
//            isOpen=false;
//        }
//    }
//
//    /**
//     * this function is to present the condition of eyes to the main body
//     */
//    private void eyesCondition()
//    {
//        System.out.println("Eye's Condition is "+this.Condition);
//    }
//}
              //Body
//
//package org.inspection.com;
//
//public class body
//{
//    private  String name;
//    private  int age;
//    private char blood;
//    private eyes Lefteyes;
//    private eyes righteyes;
//
//    public body(String name, int age, char blood, eyes lefteyes, eyes righteyes) {
//        this.name = name;
//        this.age = age;
//        this.blood = blood;
//        Lefteyes = lefteyes;
//        this.righteyes = righteyes;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public char getBlood() {
//        return blood;
//    }
//
//    public void setBlood(char blood) {
//        this.blood = blood;
//    }
//
//    public eyes getLefteyes() {
//        return Lefteyes;
//    }
//
//    public void setLefteyes(eyes lefteyes) {
//        Lefteyes = lefteyes;
//    }
//
//    public eyes getRighteyes() {
//        return righteyes;
//    }
//
//    public void setRighteyes(eyes righteyes) {
//        this.righteyes = righteyes;
//    }
//
//    protected void function(){
//        System.out.println("dsjbnjdsaf");
//    }
//}
//
