package org.example.collections.collision_resolution;

public class DoubleHashingHashTable {
    private int size;
    private String[] table;
    private boolean[] isOccupied;

    public DoubleHashingHashTable(int size) {
        this.size = size;
        table = new String[size];
        isOccupied = new boolean[size];
    }

    private int hashFunction1(String key) {
        return key.length() % size; // First hash function
    }

    private int hashFunction2(String key) {
        // Second hash function to get the step size
        // Should not result in 0 or a multiple of the table size for a non-infinite probing sequence
        return 5 - (key.length() % 5); // Example secondary hash function
    }

    public void insert(String key, String value) {
        int index = hashFunction1(key);
        int step = hashFunction2(key);

        while (isOccupied[index]) {
            index = (index + step) % size; // Double hashing
        }

        table[index] = value;
        isOccupied[index] = true;
    }

    public String search(String key) {
        int index = hashFunction1(key);
        int step = hashFunction2(key);

        while (isOccupied[index]) {
            if (table[index] != null && table[index].equals(key)) {
                return table[index]; // Key found
            }
            index = (index + step) % size; // Move to the next slot using double hashing
        }

        return null; // Key not found
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
        DoubleHashingHashTable hashTable = new DoubleHashingHashTable(10);
        hashTable.insert("apple", "red");
        hashTable.insert("banana", "yellow");
        hashTable.insert("grapes", "purple");
        hashTable.insert("orange", "orange");
        hashTable.insert("apple", "green");     // Collision for "apple"

        hashTable.display();

        String searchResult = hashTable.search("banana");
        System.out.println("Search Result for 'banana': " + searchResult);
    }
}
