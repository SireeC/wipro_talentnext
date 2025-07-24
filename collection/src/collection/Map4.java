package collection;

import java.util.*;

public class Map4 {
    public static void main(String[] args) {
        HashMap<String, Long> contacts = new HashMap<>();

        contacts.put("Abhi", 9876543210L);
        contacts.put("Chandu", 9123456780L);
        contacts.put("Siree", 9988776655L);
        contacts.put("Praneeth", 9090909090L);

        String searchName = "Chandu";
        if (contacts.containsKey(searchName)) {
            System.out.println(searchName + " is in the contact list.");
        } 
        else {
            System.out.println(searchName + " is not in the contact list.");
        }

        long searchNumber = 9988776655L;
        if (contacts.containsValue(searchNumber)) {
            System.out.println("Phone number " + searchNumber + " exists in the contact list.");
        } 
        else {
            System.out.println("Phone number " + searchNumber + " does not exist in the contact list.");
        }

        System.out.println("\nAll Contacts:");
        Set<Map.Entry<String, Long>> entrySet = contacts.entrySet();
        Iterator<Map.Entry<String, Long>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Long> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
}
