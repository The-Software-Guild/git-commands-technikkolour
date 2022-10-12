/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.nico.windowmaster;

/**
 *
 * @author Nico
 */
import java.util.Scanner;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class WindowMaster{
    public static void main(String[] args){
        float height;
        float width;
        float windowCost;
        float windowTrimCost;
        
        int windowsNumber;

        String stringHeight;
        String stringWidth;
        String stringWindowCost;
        String stringWindowTrimCost;
        String stringWindowsNumber;

        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter the window height: ");
        stringHeight = myScanner.nextLine();
        System.out.print("Please enter the winodw width: ");
        stringWidth = myScanner.nextLine();
        System.out.print("Please enter the cost of the window:  ");
        stringWindowCost = myScanner.nextLine();
        System.out.print("Please enter the cost of the window trim: ");
        stringWindowTrimCost = myScanner.nextLine();
        System.out.print("Please enter the number of windows: ");
        stringWindowsNumber = myScanner.nextLine();
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        windowCost = Float.parseFloat(stringWindowCost);
        windowTrimCost = Float.parseFloat(stringWindowTrimCost);
        windowsNumber = Integer.parseInt(stringWindowsNumber);

        areaOfWindow = height * width;
        perimeterOfWindow = 2 * (height + width);

        cost = windowsNumber * ((windowCost * areaOfWindow) + (windowTrimCost * perimeterOfWindow));

        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }
}

