/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 barhom alko
 */



package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int currAge;
        int retireAge;
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your current age? ");
        currAge = sc.nextInt();
        System.out.print("At what age would you like to retire? ");
        retireAge = sc.nextInt();

        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        int YrsLeftToRetire = retireAge - currAge;


        if (YrsLeftToRetire >= 0) {

            int retireYear = currYear + YrsLeftToRetire;
            System.out.println("You have " + YrsLeftToRetire + " years left until you can retire.");
            System.out.println("It's " + currYear + ", so you can retire in " + retireYear + ".");
        } else {
            System.out.println("You can already retire");
        }
    }
}