package org.example.oops.inheritance;

public class DogChild extends AnimalParent{

    @Override
    void eat() {
        super.eat();
        System.out.println("This Child animal eats food.");
    }

    void bark() {
        System.out.println("The dog barks.");
    }
}
