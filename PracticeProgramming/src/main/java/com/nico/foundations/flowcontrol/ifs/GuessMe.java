package com.nico.foundations.flowcontrol.ifs;
import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class GuessMe {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        String stringInput;
        int input;
        int correctValue = 76;
        
        System.out.println("I've chosen a number. Betcha can't guess it!");
        
        System.out.print("Your guess: ");
        stringInput = myScanner.nextLine();
        input = Integer.parseInt(stringInput);
        
        System.out.print(input + "? ");
        if (input == correctValue) System.out.println("Wow, nice guess! That was it.");
        else if (input < correctValue) System.out.println("Ha, nice try - too low! I chose " + correctValue + ".");
        else if (input > correctValue) System.out.println("Too bad, way too high. I chose " + correctValue + ".");       
    }
}
