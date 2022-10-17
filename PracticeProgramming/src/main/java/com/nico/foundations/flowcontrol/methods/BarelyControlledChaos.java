package com.nico.foundations.flowcontrol.methods;
import java.util.Random;
/**
 *
 * @author Nico
 */
public class BarelyControlledChaos {
    public static void main(String[] args){
        String color = randomColour();
        String animal = randomAnimal();
        String colorAgain = randomColour();
        int weight = randomNumber(5, 200);
        int distance = randomNumber(10, 20);
        int number = randomNumber(10000, 20000);
        int time = randomNumber(2, 6);
        
        System.out.println("Once, when I was very small...");
        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");
        System.out.println("I had to hide in a field of over " 
            + number + " " + colorAgain + " poppies for nearly " 
            + time + " hours until it left me alone!");
        System.out.println("\nIt was QUITE the experience," 
            + " let me tell you!");
    }
    
    public static String randomColour(){
        String colour;
        String[] colours = new String[] {"red", "orange", "teal", "pink", "green"};
        Random randomIndex = new Random();
        
        colour = colours[randomIndex.nextInt(5)];
        return(colour);
    }
    
    public static String randomAnimal(){
        String animal;
        String[] animals = new String[] {"dodo bird", "chicken", "dolphin", "beaver", "mammoth"};
        Random randomIndex = new Random();
        
        animal = animals[randomIndex.nextInt(5)];
        return(animal);
    }
    
    public static int randomNumber(int rangeStart, int rangeEnd){
        int number;
        Random random = new Random();
        
        number = random.nextInt(rangeEnd - rangeStart) + rangeStart;
        return(number);
    }
}
