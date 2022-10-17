package com.nico.foundations.flowcontrol.arrays;

/**
 *
 * @author Nico
 */
public class FruitSalad {
    public static void main(String[] args){
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", 
            "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", 
            "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", 
            "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", 
            "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        String[] fruitSalad = new String[12];
        int apples = 0, oranges = 0, i = 0, j = 0, fruitLeft = 12;
        
        while(i < fruit.length){
            if (fruitLeft > 0 && (fruit[i].toLowerCase()).contains("berry")) {
                fruitSalad[j] = fruit[i];
                i++;
                j++;
                fruitLeft--;
            }            
            else if (fruitLeft > 0 && apples < 3 && (fruit[i].toLowerCase()).contains("apple")) {
                fruitSalad[j] = fruit[i];
                apples++;
                i++;
                j++;
                fruitLeft--;
            }
            else if (fruitLeft > 0 && oranges < 3 && (fruit[i].toLowerCase()).contains("orange")) {
                fruitSalad[j] = fruit[i];
                oranges++;
                i++;
                j++;
                fruitLeft--;
            }
            else if (fruitLeft > 0 && (fruit[i].toLowerCase()).contains("tomato")) {
                i++;
            }
            else i++;
        }
        
        System.out.println((12 - fruitLeft) + " types of fruit have been used:");
        for (int x=0; x<12; x++)
            System.out.print(fruitSalad[x] + "; ");
        
    }
}
