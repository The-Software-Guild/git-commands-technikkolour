package com.nico.operations;

/**
 *
 * @author Nico
 */
public class Operations {

    public static void main(String[] args) {
        int result;
        int operand1;
        int operand2;
        int operand3;
        
        // Assignment
        result = 0;
        operand1 = 5;
        operand2 = 7;
        operand3 = operand2;
        
        // Adition
        result = 42 + 53;
        result = operand1 + operand2;
        result = 1 + operand1;
        result = 1 + operand1 + operand2 + operand3;
        
        // += Operator
        result = 2;
        result += 4;
        result += operand1;
        
        // Subtraction
        result = 9 - 5;
        result = operand1 - operand2;
        result = 15 - operand1;
        result = 19 - operand1 - operand2 - operand3;
        
        // -= Operator
        result = 2;
        result -= 4;
        result -= operand1;
        
        // Multiplication
        result = 2 * 3;
        result = operand1 * operand2;
        result = 2 * operand1;
        result = 2 * operand1 * operand2 * operand3;
        
        // *= Operator
        result = 2;
        result *= 4;
        result *= operand1;
        
        // Division and Modulus
        result = 6 / 3;
        result = operand1 / operand2;
        result = operand1 % operand2;
        result = 20 / operand1;
        result = 245 / operand1 / operand2 / operand3;
        
        // /= Operator
        result = 40;
        result /= 4;
        result /= operand1;
    }
}
