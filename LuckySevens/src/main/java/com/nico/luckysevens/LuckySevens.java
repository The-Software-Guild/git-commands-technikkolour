package com.nico.luckysevens;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Nico
 */
public class LuckySevens {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("How many dollars do you have? ");
        String dollarsAvailableString = myScanner.nextLine();
        int dollarsAvailable = Integer.parseInt(dollarsAvailableString);
        
        int maxMoney = 0, maxMoneyRoll = 0, totalRolls = 0;
        
        while(dollarsAvailable > 0){
            if (maxMoney < dollarsAvailable) {
                maxMoney = dollarsAvailable;
                maxMoneyRoll = totalRolls;
            }
            
            int number1 = rand.nextInt(7);
            int number2 = rand.nextInt(7);
            
            if (number1 + number2 == 7) dollarsAvailable += 4;
            else dollarsAvailable -= 1;
            
            totalRolls++;
        }
        
        System.out.println("You are broke after " + totalRolls + " rolls.");
        System.out.println("You should have quit after " + maxMoneyRoll + " rolls when you had $" + maxMoney + ".");
    }
}
