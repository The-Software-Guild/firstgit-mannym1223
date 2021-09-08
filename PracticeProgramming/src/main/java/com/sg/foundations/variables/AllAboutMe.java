/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author Manny
 */
public class AllAboutMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myName = "Manny";
        String favFood = "steak";
        int numPets = 3;
        String homeType = "house";
        boolean canWhistle = true;
        
        System.out.println("My name is " + myName);
        System.out.println("My favorite food is " + favFood);
        System.out.println("I have " + numPets + " pets.");
        System.out.println("I live in a " + homeType);
        if(canWhistle) {
            System.out.println("I can whistle.");
        }
        else {
            System.out.println("I can't whistle");
        }
        
    }
    
}
