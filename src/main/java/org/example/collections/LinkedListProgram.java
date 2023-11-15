package org.example.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListProgram {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
        linkedList.add("6");
        linkedList.add("7");
        linkedList.add("8");
        linkedList.add("9");
        linkedList.add("10");
        linkedList.add("11");
        linkedList.add("12");
        long start1 = System.currentTimeMillis();
        System.out.println("Start1 : "+start1);
        for(String string : linkedList){
            System.out.println("String "+string);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("end1 : "+end1);
        long calculate1 = end1 - start1;
        System.out.println("calculate1 : "+calculate1);
    }
}
