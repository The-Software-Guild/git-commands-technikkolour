package com.nico.foundations.flowcontrol.arrays;

/**
 *
 * @author Nico
 */
public class FruitsBasket {
    public static void main(String[] args){
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};
        
        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;
        
        for (int i = 0; i < fruitBasket.length; i++){
            if (fruitBasket[i].equals("Apple")) numApples++;
            else if (fruitBasket[i].equals("Orange")) numOranges++;
            else numOtherFruit++;
        }
        
        System.out.println("Total# of Fruit in Basket: " + (numOranges + numApples + numOtherFruit));
        System.out.println("Number of Apples: " + numApples);
        System.out.println("Number of Oranges: " + numOranges);
        System.out.println("Number of Other Fruit: " + numOtherFruit);
    }
}
