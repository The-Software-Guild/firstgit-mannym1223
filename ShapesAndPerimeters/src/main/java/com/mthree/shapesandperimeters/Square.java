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
public class Square extends Shape {
    private double area;
    private double perimeter;
    
    public Square(double side) {
        area = side * side;
        perimeter = side * 4;
    }
    
    @Override
    public double getArea() {
        return area;
    }
    
    @Override
    public double getPerimeter() {
        return perimeter;
    }
}
