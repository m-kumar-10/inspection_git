package com.oops.java;

public class Heart {
    private  int heartBeat;
    private String condition;

    public Heart(int heartBeat, String condition)
    {
        this.heartBeat = heartBeat;
        this.condition = condition;
    }

    public int getHeartBeat() {
        return heartBeat;
    }

    public void setHeartBeat(int heartBeat) {
        this.heartBeat = heartBeat;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    private void heartBeat(int heartBeat)
    {
        //System.out.println(name+ "'s is beating at "+heartBeat);
    }
}
