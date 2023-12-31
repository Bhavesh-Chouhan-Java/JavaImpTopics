package org.example.collections.collision_resolution;

public class LinearProbingHashTable {
    private int size;
    private String[] table;
    private boolean[] isOccupied;

    public LinearProbingHashTable(int size) {
        this.size = size;
        table = new String[size];
        isOccupied = new boolean[size];
    }

    private int hashFunction(String key) {
        return key.length() % size; // Example of a simple hash function
    }

    public void insert(String key, String value) {
        int index = hashFunction(key);
        while (isOccupied[index]) {
            index = (index + 1) % size; // Linear probing
        }
        table[index] = value;
        isOccupied[index] = true;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            if (isOccupied[i]) {
                System.out.println("Index " + i + ": " + table[i]);
            } else {
                System.out.println("Index " + i + ": null");
            }
        }
    }

    public static void main(String[] args) {
        LinearProbingHashTable hashTable = new LinearProbingHashTable(10);
        hashTable.insert("apple", "red");
        hashTable.insert("banana", "yellow");
        hashTable.insert("grapes", "purple");
        hashTable.insert("orange", "orange");
        hashTable.insert("apple", "green"); // Collision for "apple"

        hashTable.display();
    }
}
