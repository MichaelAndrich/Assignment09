/*
 *  UCF COP3330 Fall 2021 Assignment 09 Solution
 *  Copyright 2021 Michael Andrich
 */
/*

    prompt user for length and width of ceiling
    one gallon of paint covers 350 sq feet
    must be rounded up to a whole number of paint to buy

 */


import java.util.Scanner;

public class solution09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the length of the ceiling in feet? ");
        String num1 = sc.nextLine();
        int l = Integer.parseInt("" + num1);

        System.out.println("What is the width of the ceiling in feet? ");
        String num2 = sc.nextLine();
        int w = Integer.parseInt("" + num2);

        int p = (l * w);
        float tp = (p / 350);
        int result = (int)Math.ceil(tp / 350);

        System.out.println("You will need to purchase "+(result)+"  gallons of paint to cover "+(p)+" sqare feet.");

    }
}
