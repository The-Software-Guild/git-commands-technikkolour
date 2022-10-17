package com.nico.foundations.flowcontrol.ifs;
import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class BirthStones {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        String userInputString;
        int userInput;
        
        System.out.print("What month's birthstone do you want to know? ");
        userInputString = myScanner.nextLine();
        userInput = Integer.parseInt(userInputString);
        
        if (userInput < 1 || userInput > 12) System.out.println("I think you must be confused, " + userInput + " doesn't match a month.");
        else if (userInput == 1) System.out.println("January's birthstone is Garnet.");
        else if (userInput == 2) System.out.println("February's birthstone is Amethyst.");
        else if (userInput == 3) System.out.println("March's birthstone is Aquamarine.");
        else if (userInput == 4) System.out.println("April's birthstone is Diamond.");
        else if (userInput == 5) System.out.println("May's birthstone is Emerald.");
        else if (userInput == 6) System.out.println("June's birthstone is Pearl.");
        else if (userInput == 7) System.out.println("July's birthstone is Ruby.");
        else if (userInput == 8) System.out.println("August's birthstone is Peridot.");
        else if (userInput == 9) System.out.println("September's birthstone is Sapphire.");
        else if (userInput == 10) System.out.println("October's birthstone is Opal.");
        else if (userInput == 11) System.out.println("November's birthstone is Topaz.");
        else if (userInput == 12) System.out.println("December's birthstone is Turquoise.");
    }
}
