package org.example.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("name1", "Bhavesh");
        map.put("name2", "Kumar");
        map.put("name3", "Chouhan");

        System.out.println(map.get("name2"));



    }

}
