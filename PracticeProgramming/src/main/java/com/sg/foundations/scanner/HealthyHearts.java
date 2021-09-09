package com.sg.foundations.scanner;
import java.util.*;

/**
 *
 * @author Manny
 */
public class HealthyHearts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age = 25;
        
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        try {
            age = input.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("That's not a number. I'll just assume you're " + age);
        }
        int max = 220 - age;
        int targetMin = (int)(max * 0.5);
        int targetMax = (int)(max * 0.8);
        
        System.out.println("Your max heart rate should be " + max + "bpm.");
        System.out.println("Your target heart rate is " + targetMin + "-" + targetMax + "bpm.");
    }
    
}
