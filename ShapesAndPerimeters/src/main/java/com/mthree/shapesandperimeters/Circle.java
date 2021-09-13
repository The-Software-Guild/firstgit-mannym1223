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
public class Circle extends Shape{
    private final static double pi = 3.1415;
    private double area;
    private double circumference;
    
    public Circle(double radius, String color) {
        this.color = color;
        area = pi * radius * radius;
        circumference = 2 * pi * radius;
    }
    
    @Override
    public double getArea() {
        return area;
    }
    
    @Override
    public double getPerimeter() {
        return circumference;
    }
}
