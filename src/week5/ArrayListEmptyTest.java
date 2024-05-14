package week5;
/**
 * Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;

public class ArrayListEmptyTest {
    public static void main(String[] args) {
        // Creating an empty ArrayList
        ArrayList<String> arrayList1 = new ArrayList<>();

        // Creating a non-empty ArrayList
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Java");
        arrayList2.add("Python");

        // Testing if the ArrayLists are empty
        System.out.println("ArrayList1 is empty: " + arrayList1.isEmpty());
        System.out.println("ArrayList2 is empty: " + arrayList2.isEmpty());
    }
}
