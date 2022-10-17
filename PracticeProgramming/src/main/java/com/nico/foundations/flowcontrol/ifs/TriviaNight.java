package com.nico.foundations.flowcontrol.ifs;
import java.util.Scanner;
/**
 *
 * @author Nico
 */
public class TriviaNight {
    public static void main(String[] args){
        int userScore = 0;
        String userAnswerString;
        int userAnswer;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        
        //Question one:
        System.out.println("\nWhat is the Lowest Level Programming Language?"
                + "\n1. Source Code"
                + "\n2. Assembly Language"
                + "\n3. C#"
                + "\n4. Machine Code");
        System.out.print("Your answer is: ");
        userAnswerString = myScanner.nextLine();
        userAnswer = Integer.parseInt(userAnswerString);
        if (userAnswer == 4) {
            userScore++;
            System.out.println("Correct! ");
        } else System.out.println("Incorrect... ");
        System.out.println("Your current score is " + userScore + " and there are 2 questions left!");
        
        //Question two:
        System.out.println("\nWebsite Security CAPTCHA Forms Are Descended From the Work of?"
                + "\n1. Grace Hopper"
                + "\n2. Alan Turing"
                + "\n3. Charles Babbage"
                + "\n4. Larry Page");
        System.out.print("Your answer is: ");
        userAnswerString = myScanner.nextLine();
        userAnswer = Integer.parseInt(userAnswerString);
        if (userAnswer == 2) {
            userScore++;
            System.out.print("Correct! ");
        } else System.out.print("Incorrect... ");
        System.out.println("Your current score is " + userScore + " and there is 1 question left!");
        
        //Question three:
        System.out.println("\nWhich of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?"
                + "\n1. Serenity"
                + "\n2. The Battlestar Galactica"
                + "\n3. The USS Enterprise"
                + "\n4. The Millennium Falcon");
        System.out.print("Your answer is: ");
        userAnswerString = myScanner.nextLine();
        userAnswer = Integer.parseInt(userAnswerString);
        if (userAnswer == 3) {
            userScore++;
            System.out.print("Correct! ");
        } else System.out.print("Incorrect... ");
        System.out.println("Your current score is " + userScore + " and there are no questions left!");
        
        if (userScore > 0) System.out.print("\nCongrats! You answered " + userScore + " questions correctly!");
        else if (userScore == 0) System.out.print("\nOh no... You didn't answer any question correctly...");
        else if (userScore < 0) System.out.print("\n...how did you get a negative score...");
    }
}
