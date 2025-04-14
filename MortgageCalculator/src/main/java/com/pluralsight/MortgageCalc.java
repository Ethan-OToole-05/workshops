package com.pluralsight;

import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float principal, monthlyInterestRate, monthlyPay, annualInterestRate, totalInterest;
        int loanLength;

        System.out.println("Welcome to the mortgage calculator.");

        System.out.print("Please enter your principal: ");
        principal = input.nextFloat();

        System.out.print("Please enter the interest rate: ");
        annualInterestRate = input.nextFloat();
        annualInterestRate = annualInterestRate / 100;

        System.out.println("Please enter how long does the loan last: ");
        loanLength = input.nextInt();

        int loanLengthMonths = loanLength * 12;
        monthlyInterestRate = annualInterestRate / 12;
        //Formula below finds the monthly payment need to cover the loan.
        //Formula from workbook 1 - workshop.
        monthlyPay = principal * (monthlyInterestRate * (float) Math.pow(1 + monthlyInterestRate, loanLengthMonths))
                    / ((float) Math.pow(1 + monthlyInterestRate, loanLengthMonths) - 1);

        totalInterest = (monthlyPay * loanLengthMonths) - principal;

        //Used for presenting the percent after all the math is done.
        annualInterestRate *= 100;
        System.out.printf("A $%.0f loan at %.3f%% interest for %d years would " +
                "have a $%.2f/month payment with a total interest of $%.2f", principal, annualInterestRate, loanLength, monthlyPay, totalInterest);
    }
}
