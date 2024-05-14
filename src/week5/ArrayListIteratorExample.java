package week5;
/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("JavaScript");

        // Obtaining an Iterator to iterate through the ArrayList
        Iterator<String> iterator = arrayList.iterator();

        // Iterating through the ArrayList using the Iterator
        System.out.println("Iterating through ArrayList using Iterator:");
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}

