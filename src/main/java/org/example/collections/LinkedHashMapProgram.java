package org.example.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapProgram {

    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("name1", "Bhavesh");
        map.put("name2", "Kumar");
        map.put("name3", "Chouhan");

        System.out.println(map.get("name2"));

    }

}
