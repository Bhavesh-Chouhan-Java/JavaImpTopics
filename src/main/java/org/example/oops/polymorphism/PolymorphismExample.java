package org.example.oops.polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
        //Overloading
        MathOperations math = new MathOperations();
        System.out.println(math.add(10, 20));
        System.out.println(math.add(3.5, 2.5));


        //Overridden
        Shape shape = new Circle(); // Upcasting
        shape.draw(); // Calls the overridden method in Circle class
        //Overridden
        Circle circle = new Circle();
        circle.draw();
        //Overridden
        Bank yesBank = new YesBank();
        yesBank.credit();
        yesBank.debit();
        //Overridden
        Bank sbiBank = new SbiBank();
        sbiBank.credit();
        sbiBank.debit();

    }


}
