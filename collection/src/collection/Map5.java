package collection;

import java.util.*;

public class Map5 {
    public static void main(String[] args) {
        TreeMap<String, Long> contactList = new TreeMap<>();

        contactList.put("Abhi", 9876543210L);
        contactList.put("Chandu", 9123456780L);
        contactList.put("Siree", 9988776655L);

        String nameToCheck = "Chandu";
        if (contactList.containsKey(nameToCheck)) {
            System.out.println("Contact '" + nameToCheck + "' exists with number: " + contactList.get(nameToCheck));
        } else {
            System.out.println("Contact '" + nameToCheck + "' does not exist.");
        }

        long phoneToCheck = 9123456780L;
        if (contactList.containsValue(phoneToCheck)) {
            System.out.println("Phone number " + phoneToCheck + " exists in the contact list.");
        } else {
            System.out.println("Phone number " + phoneToCheck + " does not exist.");
        }

        System.out.println("\nContact List (sorted by names):");
        Set<Map.Entry<String, Long>> entries = contactList.entrySet();
        Iterator<Map.Entry<String, Long>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Long> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
}
