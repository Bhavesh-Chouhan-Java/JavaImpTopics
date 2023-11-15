package org.example.collections;

import java.util.TreeSet;

public class TreeSetProgram {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Anuj");
        treeSet.add("Joshi");
        treeSet.add("AAnand");
        treeSet.add("kalyan");
        treeSet.add("Punit");

        for(String string : treeSet){
            System.out.println("string : "+string);
        }

        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(18);
        treeSet1.add(19);
        treeSet1.add(10);
        treeSet1.add(11);
        treeSet1.add(12);

        for(Integer i : treeSet1){
            System.out.println("Integer : "+i);
        }

    }
}
