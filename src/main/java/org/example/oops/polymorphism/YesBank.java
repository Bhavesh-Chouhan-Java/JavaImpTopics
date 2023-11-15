package org.example.oops.polymorphism;

public class YesBank implements Bank{

    @Override
    public void debit() {
        System.out.println("Debit amount from yes bank.");
    }

    @Override
    public void credit() {
        System.out.println("Credit amount from yes bank.");
    }
}
