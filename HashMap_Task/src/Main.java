import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> cars = new HashMap<>();
        // Adding cars to hashmap
        cars.put(150, " Toyota");
        cars.put(75, " BMW");
        cars.put(38, " Mercedes-Benz");
        cars.put(77, " Volkswagen");
        cars.put(56, " Audi");

        System.out.print("\nOriginal data before removing smallest key: ");
        System.out.println("\n" + cars.entrySet());

        int minKey = (Collections.min(cars.keySet()));
        System.out.println("\nThe smallest key in the map: " + minKey);

        String getMinKey = cars.get(minKey);
        System.out.println("\nThe Key/Value pair of the smallest key: ");
        System.out.println("[" + minKey + "=" + getMinKey + "]");

        // removing a car with a smallest key
        cars.remove(minKey);

        // printing the updated data after removing the data with the smallest key
        System.out.print("\nUpdated data after removing the smallest key: ");
        System.out.println("\n" + cars.entrySet());

    }

}