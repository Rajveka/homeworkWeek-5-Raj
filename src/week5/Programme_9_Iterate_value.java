package week5;

import java.util.HashMap;
import java.util.Map;

public class Programme_9_Iterate_value {

        public static void main(String[] args) {
            // Create a HashMap object called people
            HashMap<String, Integer> people = new HashMap<>();

            // Add some entries to the HashMap
            people.put("Alice", 25);
            people.put("Bob", 30);
            people.put("Charlie", 28);
            people.put("David", 35);

            // Call the method to iterate over values
            iterateValues(people);
        }

        // Method to iterate over the values of the provided Map
        public static void iterateValues(Map<String, Integer> map) {
            // Iterate over the values using for-each loop
            for (Integer value : map.values()) {
                System.out.println("Value: " + value);
            }
        }
    }


