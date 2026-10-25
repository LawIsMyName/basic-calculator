package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // set the scanner up
        Scanner inputScanner = new Scanner(System.in);

        // set options for first number
        System.out.println("Enter your first number: ");
        int firstNumber = inputScanner.nextInt();
        // set options for second number
        System.out.println("Enter you second number: ");
        int secondNumber = inputScanner.nextInt();

        // give possible calculations and the types with a select option
        System.out.println("Possible Calculations");
        System.out.println("(A)dd ");
        System.out.println("(S)ubtract ");
        System.out.println("(M)ulitply ");
        System.out.println("(D)ivide ");
        System.out.println("Please select option: ");

        // set up the option selection and eat the next line for debugging
        String menuChoose = inputScanner.nextLine();
        String newLine = inputScanner.nextLine(); ///eat the new line
        System.out.println(newLine);

        // give double variable a name and assign purpose
        int product = firstNumber * secondNumber;

        // print function for the product (skipping straight to M)
        System.out.println(firstNumber + " " + "*" + " " + secondNumber + " " + "=" + " " + product);













    }
}
