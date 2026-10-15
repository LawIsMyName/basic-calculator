package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double firstNumber = inputScanner.nextDouble();

        System.out.println("Enter you second number: ");
        double secondNumber = inputScanner.nextDouble();

        System.out.println("Possible Calculations");
        System.out.println("(A)dd ");
        System.out.println("(S)ubtract ");
        System.out.println("(M)ulitply ");
        System.out.println("(D)ivide ");
        System.out.println("Please select option: ");

        String menuChoose = inputScanner.nextLine();
        String newLine = inputScanner.nextLine(); ///eat the new line
        System.out.println(newLine);

        double product = firstNumber * secondNumber;

        System.out.println("The product is" + " " + product);













    }
}
