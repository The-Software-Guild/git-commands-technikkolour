package com.nico.foundations.flowcontrol.ifs;
import java.util.Scanner;
/**
 *
 * @author Nico
 */
public class KnockKnock {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Knock Knock! Guess who!!");
        String nameGuess = inputReader.nextLine();
        
        // If the equals() is replaced with the == operator the result of the comparison is always false.
        // If the response was not esntered using the correct capitalisation, the strings would not be considered equal.
        // To fix this we can change the user input into lowercase and the correct response into "marty mcfly".
        if (nameGuess.equals("Marty McFly")) {
            System.out.println("Hey! That's right! I'm back!");
            System.out.println("... from the Future.");
        } else {
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }
}
