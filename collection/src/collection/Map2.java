package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map2 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");
        map.put("UK", "London");

        String keyToCheck = "India";
        if (map.containsKey(keyToCheck)) {
            System.out.println("Key \"" + keyToCheck + "\" exists in the map.");
        }
        else {
            System.out.println("Key \"" + keyToCheck + "\" does not exist.");
        }

        String valueToCheck = "London";
        if (map.containsValue(valueToCheck)) {
            System.out.println("Value \"" + valueToCheck + "\" exists in the map.");
        } 
        else {
            System.out.println("Value \"" + valueToCheck + "\" does not exist.");
        }

        System.out.println("\nMap entries using Iterator:");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}
