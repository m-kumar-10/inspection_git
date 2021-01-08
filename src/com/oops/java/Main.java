package com.oops.java;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Stomach stmch = new Stomach("Acidity", false);

        Heart hrt=new Heart(90, "Normal");

        Eyes leftEyes = new Eyes("Left", "Myopia", "Blue", true);

        Eyes rightEyes = new Eyes("right", "Short Vision", "Green", true);

        body divya = new body("Divya", 19, 5,
                hrt,
                stmch,
                new skin("Burnet", "creamy"),
                leftEyes,
                rightEyes);

        int options;
        String directionOfEye;
        Scanner input=new Scanner(System.in);
        for (;;)
        {

            System.out.println("Name: "+divya.getName());
            System.out.println("Age:"+divya.getAge());
            System.out.println("\n\n Choose an Organ\n");

            System.out.println("1>  Eye");
            System.out.println("2>  Heart");
            System.out.println("3>  Stomach");
            System.out.println("4>  Skin");
            System.out.println("\n \n \n Press 123 for exit application.....");

            options=input.nextInt();
            // Terminating the Loop.
            if(options==123)
            {
                break;
            }

            else if (options==1)
            {
                System.out.println("Enter Which Eyes to Check");
                System.out.println("Left /or/Right");
                directionOfEye=input.next();
                if (directionOfEye.equals("Left"))
                {
                    System.out.println(divya.getLeftEys());
                }

            }
        }
    }
}
