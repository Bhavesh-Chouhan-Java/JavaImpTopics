package org.example.oops.polymorphism;

public class Circle extends Shape{
    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing a circle");
    }
}
