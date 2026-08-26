/*
Makail Casey
8/26/2026
Cosc-113

The purpose of this program is to
1. Record the input of the user and use 6 different variables to square, cube, power it to 4,
multiply it by 2, multiply it by 3, and increase the value by the power of itself.

2. Put all of these values into 4 seperate arrays and then print out the result!
*/


package org.example;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    
    public static void main(String[] args) {
        
        // Create a Scanner object
        Scanner userInput = new Scanner(System.in);
        
        //Will end the while loop
        int count = 0;
        
        //The 4 Arrays that will store all 4 sets of values since I've never used 2d arays
        // before
        
        double[] array1 = new double[6];
        
        double[] array2 = new double[6];
        
        double[] array3 = new double[6];
        
        double[] array4 = new double[6];
        
        /*Will determine which if statement the while loop will switch to and input the
        values into a new array */
        int arrayCount = 0;
        
        //While loop that will allow user to input 4 seperate numbers
        while (count < 4) {
            // Will check fi the user inputs a string instead of a double
            try {
                //Will ask the user to input a value and record it in the input variable
                System.out.print("\nEnter any Value: ");
                
                double input = userInput.nextDouble();
                // These are the 6 values that will be created based off of the user input
                double squared = input * input;
                
                double cubed = input * input * input;
                
                double powerFour = input * input * input * input;
                
                double timesTwo = 2 * input;
                
                double timesThree = 3 * input;
                
                double absolutePower = pow(input, input);
                /*This set of else if statements will Determine which array the values will
                be inputted into*/
                if (arrayCount < 1) {
                    
                    array1[0] = squared;
                    
                    array1[1] = cubed;
                    
                    array1[2] = powerFour;
                    
                    array1[3] = timesTwo;
                    
                    array1[4] = timesThree;
                    
                    array1[5] = absolutePower;
                    
                    arrayCount++;
                    
                    count++;
                    
                } else if (arrayCount < 2) {
                    
                    array2[0] = squared;
                    
                    array2[1] = cubed;
                    
                    array2[2] = powerFour;
                    
                    array2[3] = timesTwo;
                    
                    array2[4] = timesThree;
                    
                    array2[5] = absolutePower;
                    
                    arrayCount++;
                    
                    count++;
                    
                } else if (arrayCount < 3) {
                    
                    array3[0] = squared;
                    
                    array3[1] = cubed;
                    
                    array3[2] = powerFour;
                    
                    array3[3] = timesTwo;
                    
                    array3[4] = timesThree;
                    
                    array3[5] = absolutePower;
                    
                    arrayCount++;
                    
                    count++;
                    
                } else {
                    
                    array4[0] = squared;
                    
                    array4[1] = cubed;
                    
                    array4[2] = powerFour;
                    
                    array4[3] = timesTwo;
                    
                    array4[4] = timesThree;
                    
                    array4[5] = absolutePower;
                    
                    arrayCount++;
                    
                    count++;
                    
                }
                
            } catch (NumberFormatException e) {
                // Throws this line if user inputs invalid string
                System.out.println("Invalid");
            } finally {
            
            }
            
            
        }
        //Will print out the values of each array
        System.out.println("\nThe first set of numbers are " + Arrays.toString(array1));
        
        System.out.println("\nThe second set of numbers are " + Arrays.toString(array2));
        
        System.out.println("\nThe third set of numbers are " + Arrays.toString(array3));
        
        System.out.println("\nThe fourth set of numbers are " + Arrays.toString(array4));
        
//        for (int i = 0; i <= 10; i++) {
//
//            System.out.println(i);
//
//        }
    }
}