package com.nico.foundations.flowcontrol.arrays;
import java.util.Random;

/**
 *
 * @author Nico
 */
public class HiddenNuts {
    public static void main(String[] args) {
        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden...");

        boolean nutFound = false;
        int nutSpot = 0, i = 0;
        
        while (nutFound == false){
            if (hidingSpots[i] == "Nut") {
                nutFound = true;
                nutSpot = i + 1;
            } else i++;
        }
        
        System.out.print("Found it! It's in spot #" + nutSpot);
    }
}
