package com.nico.foundations.basic_programming_concepts;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class DogGenetics {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        Random rand = new Random();
        
        int percentageLeft = 100;
        int i = 5;
        
        System.out.print("What is your dog's name? ");
        String dogName = myScanner.nextLine();
        
        String[] dogBreeds = {"Poodle", "Husky", "St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug"};
        
        System.out.println("Well then, I have this highly reliable report "
                + "on " + dogName + "'s prestigious background right here.\n");
        System.out.println(dogName + " is:\n");
        
        while(i > 0){
            int percentage;
            percentage = percentageLeft;
            
            if (i > 1) {
                while(percentageLeft - percentage == 0) {
                    percentage = rand.nextInt(percentageLeft);
                }   
            }
            
            percentageLeft -= percentage;
            System.out.println(percentage + "% " + dogBreeds[5 - i]);
            
            i--;
        }
        
        System.out.println("\nWow, that's QUITE the dog! ");
    }
}
