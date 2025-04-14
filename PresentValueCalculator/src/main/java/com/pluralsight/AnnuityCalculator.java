package com.pluralsight;

import java.util.Scanner;

public class AnnuityCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float payment, interestRate, totalAnnuity, monthlyInterest;
        int years, monthlyPayments;

        System.out.println("Welcome to the annuity value calculator.");

        System.out.print("Please enter your monthly payment: ");
        payment = input.nextFloat();

        System.out.print("Please enter the interest rate: ");
        interestRate = input.nextFloat();
        interestRate = interestRate / 100;

        System.out.println("Please enter how many years will you be paying: ");
        years = input.nextInt();

        monthlyInterest = interestRate / 12;
        monthlyPayments = years * 12;
        //Formula below calculates the annuity.
        //Formula from workbook 1 - workshop.
        //Link from workbook: https://financialmentor.com/calculator/present-value-of-annuity-calculator
        monthlyPayments = monthlyPayments * -1;
        totalAnnuity = payment * ((1 - (float) Math.pow(1 + monthlyInterest, monthlyPayments)) / (monthlyInterest));

        System.out.printf("Your total annuity will be: $%.2f ", totalAnnuity);

    }
}