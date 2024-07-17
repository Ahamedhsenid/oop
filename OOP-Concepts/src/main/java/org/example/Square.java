package org.example;

import java.util.Scanner;

class Square extends Shape {

    private double side;
    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getPerimeter() {
        return 4 * side;
    }

    @Override
    void printProperties(){
        System.out.println("Side = " +side);
    }

}
