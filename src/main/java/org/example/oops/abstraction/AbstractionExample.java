package org.example.oops.abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();// Calls the overridden method in Circle class

        Parent child = new Child();
        child.business();
    }
}
