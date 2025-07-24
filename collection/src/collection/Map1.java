package collection;
import java.util.*;

public class Map1 {

    private HashMap<String, String> M1;

    public Map1() {
        M1 = new HashMap<>();
    }

    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public HashMap<String, String> reverseMap() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        Map1 ccm = new Map1();

        ccm.saveCountryCapital("India", "Delhi");
        ccm.saveCountryCapital("Japan", "Tokyo");

        System.out.println("Capital of India: " + ccm.getCapital("India"));

        System.out.println("Country with capital Tokyo: " + ccm.getCountry("Tokyo"));

        HashMap<String, String> M2 = ccm.reverseMap();
        System.out.println("Reversed Map (Capital -> Country): " + M2);

        ArrayList<String> countries = ccm.getAllCountries();
        System.out.println("All Countries: " + countries);
    }
}
