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
public class MenuOfChampions {
    static String menuArt = ".-\"-.     .-\"-.     .-\"-.     .-\"-.     .-\"-.     .-\"-.\n" +
"     \"-.-\"     \"-.-\"     \"-.-\"     \"-.-\"     \"-.-\"     \"-.-\"";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String restaurantName = "Hello Food!";
        
        String food1 = "Steak";
        float price1 = 10.99f;
        String food2 = "Tacos";
        float price2 = 5.99f;
        String food3 = "Cake";
        float price3 = 7.50f;
        
        System.out.println(menuArt);
        System.out.println("                 Welcome to " + restaurantName);
        System.out.println(menuArt);
        
        System.out.println("(1) " + food1 + ", $" + price1);
        System.out.println("(2) " + food2 + ", $" + price2);
        System.out.println("(3) " + food3 + ", $" + price3);
    }
    
}
