package com.nico.basicprogrammingconcepts;

/**
 *
 * @author Nico
 */
public class SummativeSums {
    public static void main(String[] args){
        int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] array2 = { 999, -60, -77, 14, 160, 301 };
        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 
            110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
        
        arraySum(array1, 1);
        arraySum(array2, 2);
        arraySum(array3, 3);
    }
    
    public static void arraySum(int[] array, int arrayNumber){
        int sum = 0;
        
        for (int i = 0; i<array.length; i++){
            sum += array[i];
        }
        
        System.out.println("#" + arrayNumber + "Array Sum: " + sum);
    }
    
}
