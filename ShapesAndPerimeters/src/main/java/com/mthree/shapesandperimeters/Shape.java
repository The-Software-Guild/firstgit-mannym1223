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
public abstract class Shape {
    String color;
    double area;
    double perimeter;
    
    public double getArea() {
        return area;
    }
    
    public double getPerimeter() {
        return perimeter;
    }
}
