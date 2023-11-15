package org.example.oops.polymorphism;

public class SbiBank implements Bank{

    @Override
    public void debit() {
        System.out.println("Debit amount from sbi bank.");
    }

    @Override
    public void credit() {
        System.out.println("Credit amount from sbi bank.");
    }
}
