package org.example.collections;

import java.util.Stack;

public class StackProgram {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(11);
        stack.add(12);

        stack.pop();
        stack.peek();
        stack.add(13);
        stack.add(10);
        stack.add(9);
        stack.add(0);
        stack.add(11);

        System.out.println(stack);
    }
}
