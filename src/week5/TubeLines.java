package week5;
/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TubeLines {
    public static void main(String[] args) {
        // Create a map to store stations and their corresponding tube lines
        Map<String, Set<String>> tubeLines = new HashMap<>();

        // Add stations and their tube lines to the map
        tubeLines.put("Baker Street", Set.of("Bakerloo", "Circle", "Hammersmith & City", "Jubilee", "Metropolitan"));
        tubeLines.put("Holborn", Set.of("Central", "Piccadilly"));
        tubeLines.put("Leicester Square", Set.of("Northern", "Piccadilly"));
        tubeLines.put("King's Cross St Pancras", Set.of("Circle", "Hammersmith & City", "Metropolitan", "Northern", "Piccadilly", "Victoria"));

        // Stations to check
        String[] stationsToCheck = {"Baker Street", "Holborn", "Leicester Square", "King's Cross St Pancras"};

        // Print which lines pass through each station
        for (String station : stationsToCheck) {
            if (tubeLines.containsKey(station)) {
                Set<String> lines = tubeLines.get(station);
                System.out.println(station + " is served by the following tube lines: " + lines);
            } else {
                System.out.println(station + " is not a Zone 1 station or does not have tube service.");
            }
        }
    }
}
