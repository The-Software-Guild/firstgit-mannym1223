/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;
import java.util.Scanner;

/**
 *
 * @author Manny
 */
public class AllTheTrivia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String question1 = "How old is the Earth in years?";
        String question2 = "What is the answer to life and everything?";
        String question3 = "What color is the sky?";
        Scanner input = new Scanner(System.in);
        
        System.out.println(question1);
        String answer1 = input.nextLine();
        System.out.println(question2);
        String answer2 = input.nextLine();
        System.out.println(question3);
        String answer3 = input.nextLine();
        
        System.out.println("The Earth is " + answer2 + " years old.");
        System.out.println("The answer to life and everything is " + answer3);
        System.out.println("The sky is " + answer1);
    }
    
}
