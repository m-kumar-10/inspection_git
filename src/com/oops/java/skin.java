package com.oops.java;

public class skin
{
    private String condition;
    private String colour;

    public skin(String condition, String colour)
    {
        this.condition = condition;
        this.colour = colour;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    private void skin()
    {
        System.out.println("this is pateint's skin");
    }
}
