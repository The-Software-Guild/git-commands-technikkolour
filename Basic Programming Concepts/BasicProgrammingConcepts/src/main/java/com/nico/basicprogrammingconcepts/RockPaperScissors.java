package com.nico.foundations.basic_programming_concepts;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Nico
 */
public class RockPaperScissors {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String playerInput;
        int i;
        boolean gamePlayed = false;
        
        do {
            System.out.print("How many rounds would you like to play? ");
            playerInput = myScanner.nextLine();
            
            // In case the player enters letters instead of numbers.
            try {
                i = Integer.parseInt(playerInput);
            } catch(NumberFormatException e){
                System.out.println("Not a number...");
                break;
            }
            
            if (i <= 0 || i >= 10) {
                System.out.println("Invalid input... Must play at least 1 round and at most 10.");
                break;
            }
            
            // scoreSystem[0] represents the ties
            // scoreSystem[1] represents the player wins
            // scoreSystem[2] represents the computr wins
            int[] scoreSystem = {0, 0, 0};
            
            while (i > 0){  
                scoreSystem = gamePlay(scoreSystem);
                i--;
            }
            
            System.out.println("Ties: " + scoreSystem[0] + "\nGames won by the user: " + scoreSystem[1] 
                    + "\nGames won by the computer: " + scoreSystem[2]);
            
            if (scoreSystem[1] > scoreSystem[2]) System.out.println("The user has won the most games!");
            if (scoreSystem[1] < scoreSystem[2]) System.out.println("The computer has won the most games...");
                        
            System.out.print("\nWould you like to play again? ");
            playerInput = myScanner.nextLine();
            
            gamePlayed = true;
        } while ((playerInput.toLowerCase()).equals("yes"));
        
        if (gamePlayed == true) System.out.println("Thanks for playing!");
    }
    
    public static String computerChoice(){
        String choice;
        String[] options = {"rock", "paper", "scissors"};
        
        Random rand = new Random();
        choice = options[rand.nextInt(3)];
        
        return choice;
    }
    
    public static int[] gamePlay(int[] scoreSystem){
        Scanner myScanner = new Scanner(System.in);
        String playerChoice = myScanner.nextLine();
        String computerChoice = computerChoice();
        
        System.out.println("The computer played: " + computerChoice);
        
        if ((playerChoice.toLowerCase()).equals(computerChoice)) {
            scoreSystem[0]++;
            System.out.println("It's a tie!\n");
        }
        else if ((playerChoice.toLowerCase()).equals("rock") && computerChoice.equals("scissors")) {
            scoreSystem[1]++;
            System.out.println("Win!\n");
        }
        else if ((playerChoice.toLowerCase()).equals("paper") && computerChoice.equals("rock")) {
            scoreSystem[1]++;
            System.out.println("Win!\n");
        }
        else if ((playerChoice.toLowerCase()).equals("scissors") && computerChoice.equals("paper")) {
            scoreSystem[1]++;
            System.out.println("Win!\n");
        }
        else {
            // If the player makes an invalid move, the game is counted as a loss for them.
            scoreSystem[2]++;
            System.out.println("Loss...\n");
        } 
        
        return scoreSystem;
    }
    
}
