package com.oops.java;

public class Eyes
{
    private String side;
    private  String condition;
    private String color;
    private boolean opening=false;

    public Eyes(String side, String condition, String color, boolean opening) {
        this.side = side;
        this.condition = condition;
        this.color = color;
        this.opening = opening;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpening() {
        return opening;
    }

    public void setOpening(boolean opening) {
        this.opening = opening;
    }

    public void close(int option)
    {
        if (option==1)
        {
            if (opening==false)
            {
                System.out.println("Close the "+side+" of eyes");
                opening=true;
            }
            else
            {
                System.out.println("Open the "+side+" of eyes");
                opening=false;
            }
        }

    }

}
