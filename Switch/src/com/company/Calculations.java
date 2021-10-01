package com.company;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner first = new Scanner (System.in);
        int numberOne = first.nextInt();
        System.out.println("Enter second number");
        Scanner second = new Scanner (System.in);
        int numberTwo = second.nextInt();
        System.out.println("Please write any of the following options:");
        System.out.println("‘+’ to sum both elements");
        System.out.println("’-’ to do subtraction");
        System.out.println("’/’ to do dividing;");
        System.out.println("‘*’ to do multiplication");
        System.out.println("‘%’ to get remainder when the first element is divided by the second element");
        System.out.println("‘p’: print out both elements");
        System.out.println("‘b’ to verify which element is bigger;");
        System.out.println("‘s’ to verify which element is smaller;");

        Scanner option = new Scanner (System.in);
        char calculation = option.next().charAt(0);

        switch (calculation) {
            case '+':
                System.out.println(numberOne + "+" + numberTwo + "=" + (numberOne + numberTwo));
                break;
            case '-':
                System.out.println(numberOne + "-" + numberTwo + "=" + (numberOne - numberTwo));
                break;
            case '/':
                System.out.println(numberOne + "/" + numberTwo + "=" + (numberOne / numberTwo));
                break;
            case '*':
                System.out.println(numberOne + "*" + numberTwo + "=" + (numberOne * numberTwo));
                break;
            case '%':
                System.out.println(numberOne + "%" + numberTwo + "=" + (numberOne % numberTwo));
                break;
            case 'p':
                System.out.println(numberOne + ", " + numberTwo);
                break;
            case 'b':
                if (numberOne > numberTwo)
                    System.out.println(numberOne + " >" + numberTwo);
                else if (numberOne < numberTwo)
                    System.out.println(numberTwo + ">" + numberOne);
                else
                    System.out.println(numberOne + "=" + numberTwo);
                break;
            case 's':
                if (numberOne < numberTwo)
                    System.out.println(numberOne + "<" + numberTwo);
                else if (numberOne > numberTwo)
                    System.out.println(numberTwo + "<" + numberOne);
                else
                    System.out.println(numberOne + "=" + numberTwo);
                break;
            default:
                System.out.println("Invalid transaction. Please try another option");
                break;
        }
    }
}
