package collection;

import java.util.*;

public class Map3 {
    public static void main(String[] args) {
        Properties stateCapitals = new Properties();

        stateCapitals.setProperty("Andhra Pradesh", "Amaravati");
        stateCapitals.setProperty("Karnataka", "Bengaluru");
        stateCapitals.setProperty("Tamil Nadu", "Chennai");
        stateCapitals.setProperty("Maharashtra", "Mumbai");
        stateCapitals.setProperty("West Bengal", "Kolkata");

        Set<Map.Entry<Object, Object>> entries = stateCapitals.entrySet();

        Iterator<Map.Entry<Object, Object>> iterator = entries.iterator();

        System.out.println("States and their Capitals:");
        while (iterator.hasNext()) {
            Map.Entry<Object, Object> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
