package com.georgioskachrimanis.javacourse;

public class Cylinder extends Circle{

    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        if (height < 0) {
            this.height = 0;
        }
    }

    // Getters
    public double getHeight() {
        return height;
    }

    // Methods
    public double getVolume() {
        return getArea() * height;
    }

}
