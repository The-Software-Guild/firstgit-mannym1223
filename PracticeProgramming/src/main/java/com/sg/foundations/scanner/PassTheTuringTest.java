/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;
import java.util.*;

/**
 *
 * @author Manny
 */
public class PassTheTuringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myName = "Manny";
        String userName;
        String favColor;
        String favFood;
        int favNumber = 0;
        
        Scanner inScanner = new Scanner(System.in);
        
        System.out.println("What is your name?");
        userName = inScanner.nextLine();
        System.out.println("Hello " + userName + ", my name is " + myName);
        
        System.out.println("What's your favorite color?");
        favColor = inScanner.nextLine();
        System.out.println(favColor + " is a nice color.");
        
        System.out.println("What about your favorite food?");
        favFood = inScanner.nextLine();
        System.out.println(favFood + "? Interesting choice.");
        
        System.out.println("And your favorite number?");
        try {
            favNumber = inScanner.nextInt();
        }catch(InputMismatchException e) {
            System.out.println("That wasn't a number.");
        }
        System.out.println("Well anyway, thanks for the talk. See you later " + userName);
    }
    
}
