package com.company;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        System.out.println("Please enter a weekday number");
        Scanner weekday = new Scanner(System.in);
        int day = weekday.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a working day");
                break;

            case 6:
            case 7:
                System.out.println("It is holiday");
                break;

            default:
                System.out.println("Such weekday does not exist. Please enter a valid weekday.");
                break;
        }

    }
}
