package com.nico.interestcalculator;
import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("How much would you like to invest? ");
        String investmentStartingString = myScanner.nextLine();
        float investmentStarting = Float.parseFloat(investmentStartingString);
        
        System.out.print("How many years are you investing? ");
        String investmentDurationString = myScanner.nextLine();
        int investmentDuration = Integer.parseInt(investmentDurationString);
        
        System.out.print("What is the annual interest rate % growth? ");
        String interestRateString = myScanner.nextLine();
        int interestRate = Integer.parseInt(interestRateString);
        
        System.out.println("\nCalculating...");
        
        int yearsLeft = investmentDuration;
        
        while(yearsLeft > 0){
            float interest = (investmentStarting * interestRate) / 100;
            float investmentFinal = investmentStarting + interest;
            System.out.println("\nYear " + (investmentDuration - yearsLeft + 1) + ":");
            System.out.println("Began with $" + investmentStarting);
            System.out.println("Earned $" + interest);
            System.out.println("Ended with $" + investmentFinal);
            
            investmentStarting = investmentFinal;
            yearsLeft--;
        }
    }
}
