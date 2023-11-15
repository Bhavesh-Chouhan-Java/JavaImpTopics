package org.example.collections;


import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProgram {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue();

        queue.add(11);
        queue.add(12);
        queue.poll();
        queue.offer(15);

        queue.peek();
        queue.add(13);
        queue.add(10);
        queue.add(9);
        queue.add(0);
        queue.add(11);
        queue.element();

        System.out.println(queue);
    }
}
