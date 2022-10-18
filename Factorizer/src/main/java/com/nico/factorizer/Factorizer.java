package com.nico.factorizer;
import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class Factorizer {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("What number would you like to factor? ");
        String numberString = myScanner.nextLine();
        int number = Integer.parseInt(numberString);
        
        int factorCount = 0, factorSum = 0;
        
        System.out.println("Them factors of " + number + " are:");
        for (int i = 1; i <= number; i++){
            if (number % i == 0) {
                System.out.print(i + " ");
                factorCount++;
                factorSum += i;
            }
        }
        
        System.out.println("\n" + number + " has " + factorCount + " factors.");
                
        if (factorSum - number == number) System.out.println(number + " is a perfect number.");
        else System.out.println(number + " is not a perfect number.");
        
        if (factorCount == 2) System.out.println(number + " is a prime number.");
        else System.out.println(number + " is not a prime number.");
    }
}
