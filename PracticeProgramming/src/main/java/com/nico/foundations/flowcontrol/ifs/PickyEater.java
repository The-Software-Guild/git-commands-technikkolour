package com.nico.foundations.flowcontrol.ifs;
import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class PickyEater {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("How many times has it been fried? (#) ");
        int timesFried = Integer.parseInt(userInput.nextLine());

        System.out.print("Does it have any spinach in it? (y/n) ");
        String hasSpinach = userInput.nextLine();

        System.out.print("Is it covered in cheese? (y/n) ");
        String cheeseCovered = userInput.nextLine();

        System.out.print("How many pats of butter are on top? (#) ");
        int butterPats = Integer.parseInt(userInput.nextLine());

        System.out.print("Is it covered in chocolate? (y/n) ");
        String chocolateCovered = userInput.nextLine();

        System.out.print("Does it have a funny name? (y/n) ");
        String funnyName = userInput.nextLine();

        System.out.print("Is it broccoli? (y/n) ");
        String isBroccoli = userInput.nextLine();

        if (hasSpinach.equals("y") || funnyName.equals("y")) {
            System.out.println("There's no way he'll eat that!");
        }
        else if (cheeseCovered.equals("y") && timesFried == 2) {
            System.out.println("Mmm. Yeah, he'll each fried cheesy doodles.");
        }
        else if (chocolateCovered.equals("y") && timesFried > 2 && timesFried < 4) {
            System.out.println("Oh, it's like a deep-fried Snickers. That'll be a hit!");
        }
        else if (cheeseCovered.equals("y") && butterPats > 6 && isBroccoli.equals('y')) {
            System.out.println("As long as the green is hidden by cheddar, it'll happen!");
        }
        else if (isBroccoli.equals("y")) {
            System.out.println("Oh, green stuff like that might as well go in the bin.");
        }
    }
}
