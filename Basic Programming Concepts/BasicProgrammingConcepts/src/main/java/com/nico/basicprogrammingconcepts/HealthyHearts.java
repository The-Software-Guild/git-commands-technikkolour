package com.nico.foundations.basic_programming_concepts;
import java.util.Scanner;
import java.math.RoundingMode;

/**
 *
 * @author Nico
 */
public class HealthyHearts {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("What is your age? ");
        String ageString = myScanner.nextLine();
        int age = Integer.parseInt(ageString);
        
        int maximumHR = 220 - age;
        int targetHRMin = (maximumHR * 50) / 100;
        int targetHRMax = (int) Math.round((maximumHR * 85) / 100.0);
        
        System.out.println("Your maximum heart rate should be " + 
                maximumHR + " beats per minute.");
        System.out.println("Your target HR Zone is " + targetHRMin + 
                " - " + targetHRMax + " beats per minute.");
    }
}
