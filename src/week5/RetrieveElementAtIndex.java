package week5;
/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

import java.util.ArrayList;

public class RetrieveElementAtIndex {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("JavaScript");

        // Specified index
        int index = 2; // Retrieving the element at index 2 (3rd element)

        // Retrieving the element at the specified index
        if (index >= 0 && index < arrayList.size()) {
            String element = arrayList.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } else {
            System.out.println("Invalid index specified.");
        }
    }
}