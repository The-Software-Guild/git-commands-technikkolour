package com.nico.foundations.flowcontrol.ifs;

/**
 *
 * @author Nico
 */
public class SpaceRustlers {
    public static void main(String[] args){
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;
        
        if (aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
        }
        else {
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        
        if (cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        }
        else if (cows > spaceships){
            System.out.println("Dangit! I don't know how we're going to fit all these cows in here!");
        }
        else {
            System.out.println("Too many ships, not enough cows!");
        }
        
        if (cows <= aliens) {
            System.out.println("Hurrah, we've got the grub! Hamburger party on ALpha Centauri!");
        }
        else {
            System.out.println("Oh no! The herds got restless and took over! Looks like _we're_ hamburger now!!");
        }
        
        // If tells the computer to do something only if a condition is met.
        // Else, on it's own, tells the computer to do something if the initial condition in the if statement was not met.
        // Else If is used when there are other conditions to consider if the initial one is not met.
        
        // If we were to remove the Else from the Else If then the statement will always be considered, not just when the first If statement condition was not met.
    }
}
