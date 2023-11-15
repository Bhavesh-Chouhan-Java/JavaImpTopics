package org.example.collections;


import java.util.*;

public class ArrayListProgram {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        System.out.println("Start : "+start);
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        arrayList.add("8");
        arrayList.add("9");
        arrayList.add("10");
        arrayList.add("11");
        arrayList.add("12");
        arrayList.add("13");
        arrayList.add("14");
        arrayList.add("15");
        arrayList.add("16");
        arrayList.add("17");
        arrayList.add("18");
        arrayList.add("19");
        arrayList.add("20");
        long end = System.currentTimeMillis();
        System.out.println("end : "+end);
        long calculate = end - start;
        System.out.println("calculate : "+calculate);

        long start1 = System.currentTimeMillis();
        System.out.println("Start1 : "+start1);
        for(String string : arrayList){
            System.out.println("string : "+string);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("end1 : "+end1);
        long calculate1 = end1 - start1;
        System.out.println("calculate1 : "+calculate1);
    }
}
