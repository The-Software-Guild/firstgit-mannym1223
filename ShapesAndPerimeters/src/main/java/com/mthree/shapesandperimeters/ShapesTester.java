/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.shapesandperimeters;

/**
 *
 * @author Manny
 */
public class ShapesTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double side = 3.0;
        String green = "Green";
        
        Shape square = new Square(side, green);
        System.out.println("---Square---");
        System.out.println("Color: " + square.getColor());
        System.out.println("Perimater: " + square.getPerimeter() + ", Area: " + square.getArea());
    }
    
}
