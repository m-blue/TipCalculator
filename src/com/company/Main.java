package com.company;

import java.util.Currency;
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean isDone = false;

        double totalCost = 0;
        double totalWithTax = 0;
        double taxPercentage = 0.025; // write in decimal form
        double tipPercentage = 0.175; // write in decimal form
        double tipAmount = 0;

        System.out.println("Enter your item costs (enter 0 when your done): ");
        do{

            double userInput = scan.nextDouble();
            if(userInput == 0){
                isDone = true;
            }
            else {
            totalCost += userInput;
            }
        }while (!isDone);

        totalWithTax = totalCost + (totalCost * taxPercentage);

        tipAmount = totalWithTax * tipPercentage;

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setGroupingUsed(true);
        //nf.setMaximumFractionDigits(2);
        //nf.setMinimumFractionDigits(2);

        System.out.println("Your total cost is " + nf.format(totalCost));
        System.out.println("The tax is " + taxPercentage * 100 + "%");
        System.out.println("Your total cost with tax is " + nf.format(totalWithTax));
        System.out.println("A " + nf.format(tipAmount) + " tip is recommended");
    }
}
