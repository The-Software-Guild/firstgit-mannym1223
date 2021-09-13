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
public class Rectangle extends Shape {
    private double area;
    private double perimeter;
    
    public Rectangle(double length, double width, String color) {
        this.color = color;
        area = length * width;
        perimeter = 2 * (length + width);
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
