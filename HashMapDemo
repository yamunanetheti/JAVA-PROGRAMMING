import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");

        // Display the HashMap
        System.out.println("Initial HashMap: " + studentMap);

        // Retrieve a value using a key
        String name = studentMap.get(102);
        System.out.println("Student with ID 102: " + name);

        // Update a value
        studentMap.put(103, "David");
        System.out.println("Updated HashMap (ID 103 updated): " + studentMap);

        // Remove a key-value pair
        studentMap.remove(101);
        System.out.println("HashMap after removing ID 101: " + studentMap);

        // Iterate over HashMap entries
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Check if a key or value exists
        System.out.println("Contains key 102? " + studentMap.containsKey(102));
        System.out.println("Contains value 'Alice'? " + studentMap.containsValue("Alice"));
    }
}
