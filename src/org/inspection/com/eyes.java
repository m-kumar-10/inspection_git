package org.inspection.com;

public class eyes {
    private  String color;
    private String Condition;
    private Boolean isOpen;

//    This is constructor for eyes class.


    public eyes(String color, String condition, Boolean isOpen)
    {
        this.color = color;
        Condition = condition;
        this.isOpen = isOpen;
    }
//    providing getter and setter for eyes class


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    /**
     * this function will control
     * eyes opening or closing
     * this should be used for both eyes.
     *
     */
    public void function()
    {
        if (!isOpen)
        {
            System.out.println("\t\t\t\t Eyes is opening");
            isOpen=true;
        }
        else
            {
                System.out.println("\t\t\t\t Eyes is closing");
                isOpen=false;
            }
    }

    /**
     * this function is to present the condition of eyes to the main body
     */
    private void eyesCondition()
    {
        System.out.println("Eye's Condition is "+this.Condition);
    }
}
