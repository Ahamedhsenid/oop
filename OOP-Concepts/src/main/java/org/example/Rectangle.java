package org.example;

import java.util.Scanner;


class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height,double width){
        this.height=height;
        this.width=width;

    }

    public void setHeight(double height){
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    double getArea() {
        return height * width;
    }

    @Override
    double getPerimeter() {
        return 2 * (height + width);
    }
    @Override
    void printProperties(){
        System.out.println("Height = " + height);
        System.out.println("width="+ width);
    }

}