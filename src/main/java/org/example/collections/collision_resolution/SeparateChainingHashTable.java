package org.example.collections.collision_resolution;

import java.util.LinkedList;

public class SeparateChainingHashTable {
    private int size;
    private LinkedList<String>[] table;

    public SeparateChainingHashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashFunction(String key) {
        return key.length() % size; // Example of a simple hash function
    }
    public void insert(String key, String value) {
        int index = hashFunction(key);
        table[index].add(value);
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print("Index " + i + ": ");
            for (String item : table[i]) {
                System.out.print(item + " -> ");
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {

        SeparateChainingHashTable hashTable = new SeparateChainingHashTable(10);
        hashTable.insert("apple", "red");
        hashTable.insert("banana", "yellow");
        hashTable.insert("grapes", "purple");
        hashTable.insert("orange", "orange");
        hashTable.insert("apple", "green"); // Collision for "apple"

        hashTable.display();
    }

}
