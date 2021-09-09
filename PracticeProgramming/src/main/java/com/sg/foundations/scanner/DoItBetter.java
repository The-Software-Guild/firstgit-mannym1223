package com.sg.foundations.scanner;
import java.util.*;

/**
 *
 * @author Manny
 */
public class DoItBetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numHotdogs;
        int numLanguages;
        int numMiles;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many miles can you run?");
        try {
            numMiles = input.nextInt();
            System.out.println("Oh really? Well I can run " + ((numMiles * 2)+1) + " miles.");
            System.out.println("Are you dodging the question?");
        
            System.out.println("How many hotdogs can you eat?");
            numHotdogs = input.nextInt();
            System.out.println("I can eat " + ((numHotdogs * 2)+1) + " hotdogs.");
        
            System.out.println("How many languages do you know?");
            numLanguages = input.nextInt();
            System.out.println("Well I know " + ((numLanguages * 2)+1) + " languages.");
        }
        catch(InputMismatchException e) {
            System.out.println("Are you dodging the question?");
        }
    }
    
}
