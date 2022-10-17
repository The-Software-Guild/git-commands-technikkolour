package com.nico.foundations.flowcontrol.ifs;
import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class YourLifeInMovies {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String userBirthYearString;
        int userBirthYear;
        
        System.out.print("When were you born? ");
        userBirthYearString = myScanner.nextLine();
        userBirthYear = Integer.parseInt(userBirthYearString);
        
        System.out.println(userBirthYear + "?? That's so long ago! Did you know that...");
        if (userBirthYear < 2005 ) System.out.println("Pixar's 'Up' came out over a decade ago.");
        if (userBirthYear < 1995 ) System.out.println("The first Harry Potter came out over 15 years ago.");
        if (userBirthYear < 1985 ) System.out.println("Space Jam came out not last decade, but the one before THAT.");
        if (userBirthYear < 1975 ) System.out.println("The original Jurassic Park release is closer to the first lunar landing than it is to today.");
        if (userBirthYear < 1965 ) System.out.println("The MASH TV series has been around for almost half a century!");
    }
}
