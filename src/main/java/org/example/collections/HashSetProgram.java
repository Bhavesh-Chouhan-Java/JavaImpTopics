package org.example.collections;


import java.util.HashSet;

public class HashSetProgram {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("7");
        hashSet.add("8");
        hashSet.add("9");
        hashSet.add("81");
        hashSet.add("10");
        hashSet.add("11");
        hashSet.add("12");

        for(String string : hashSet){
            System.out.println("string : "+string);
        }

        HashSet<Integer> hashSet2 = new HashSet<>();

        hashSet2.add(6);
        hashSet2.add(2);
        hashSet2.add(5);
        hashSet2.add(1);
        hashSet2.add(34);
        hashSet2.add(23);
        hashSet2.add(55);

        for(Integer integeri : hashSet2){
            System.out.println("Integer : "+integeri);
        }





    }
}
