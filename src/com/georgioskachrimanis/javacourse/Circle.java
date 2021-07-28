package com.georgioskachrimanis.javacourse;

public class Circle {

    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
        if (radius < 0) {
            this.radius = 0;
        }
    }

    // Getter and Setter
    public double getRadius() {
        return radius;
    }

    //Methods
    public double getArea() {
        return (radius * radius * Math.PI);
    }

}
