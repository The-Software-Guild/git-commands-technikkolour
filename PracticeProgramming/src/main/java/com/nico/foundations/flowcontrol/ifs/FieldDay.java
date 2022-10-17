package com.nico.foundations.flowcontrol.ifs;
import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class FieldDay {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("What's your last name? ");
        String name = myScanner.nextLine();
        String team;
        
        if (name.compareTo("Baggins") <= 0) team = "Red Dragons";
        else if (name.compareTo("Baggins") > 0 && name.compareTo("Dresden") <= 0) team = "Dark Wizards";
        else if (name.compareTo("Dresden") > 0 && name.compareTo("Howl") <= 0) team = "Moving Castles";
        else if (name.compareTo("Howl") > 0 && name.compareTo("Potter") <= 0) team = "Golden Snitches";
        else if (name.compareTo("Potter") > 0 && name.compareTo("Vimes") <= 0) team = "Night Guards";
        else team = "Black Holes";
        
        System.out.println("Aha! You're on the team " + team + "!");
        System.out.print("Good luck in the games!");
    }
}
