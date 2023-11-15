package org.example.oops.abstraction;

public class Child implements Parent{
    @Override
    public void business() {
        System.out.println("Child can use parent money : "+money);
    }
}
