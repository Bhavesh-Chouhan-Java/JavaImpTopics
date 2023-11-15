package org.example.collections;


import java.util.LinkedHashSet;

public class LinkedHashSetProgram {
    public static void main(String[] args) {

        LinkedHashSet<String> hashSet = new LinkedHashSet<>();

        hashSet.add("Abhishak");
        hashSet.add("Rahul");
        hashSet.add("Rohit");
        hashSet.add("Dinesh");
        hashSet.add("Abhilasha");

        for (String s : hashSet) {
            System.out.println("iterator : " + s);
        }


        LinkedHashSet<Integer> hashSet1 = new LinkedHashSet<>();
        hashSet1.add(11);
        hashSet1.add(1);
        hashSet1.add(10);
        hashSet1.add(0);
        hashSet1.add(12);
        hashSet1.add(4);

        for (Integer s1 : hashSet1) {
            System.out.println("iterator : " + s1);
        }



        //Get Random Data
        

    }
}
