package com.oops.java;

import javax.xml.namespace.QName;

public class Stomach
{
    private String condition;
    private boolean full;

    public Stomach(String condition, boolean full) {
        this.condition = condition;
        this.full = full;
    }

    public String getCondition()
    {
        return condition;
    }

    public void setCondition(String condition)
    {
        this.condition = condition;
    }

    public boolean isFull()
    {
        return full;
    }

    public void setFull(boolean full)
    {
        this.full = full;
    }
    // do you wants to feed him?
    private  void eat(boolean food)
    {
       // System.out.println(+ " is digesting");
    }
}