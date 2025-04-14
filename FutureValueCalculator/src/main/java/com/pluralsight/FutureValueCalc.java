package com.pluralsight;

import java.util.Scanner;

public class FutureValueCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float principal,futureValue, annualInterestRate, totalInterest;
        int years;

        System.out.println("Welcome to the future value calculator.");

        System.out.print("Please enter your deposit amount: ");
        principal = input.nextFloat();

        System.out.print("Please enter the interest rate: ");
        annualInterestRate = input.nextFloat();
        annualInterestRate = annualInterestRate / 100;

        System.out.println("Please enter how long will the item mature: ");
        years = input.nextInt();

        //Formula below calculates the future value of the item.
        //Formula from workbook 1 - workshop.
        futureValue = principal * (float) Math.pow(1 + annualInterestRate / 365, (365 * years));

        totalInterest = futureValue - principal;


        System.out.printf("The ending value will be $%.2f and you would have earned $%.2f in interest", futureValue, totalInterest);

    }
}