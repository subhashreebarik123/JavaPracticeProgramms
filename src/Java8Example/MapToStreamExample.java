package Java8Example;

import java.util.HashMap;
import java.util.Map;

public class MapToStreamExample {

        public static void main(String[] args) {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "Apple");
            map.put(2, "Banana");
            map.put(3, "Cherry");


            map.entrySet().stream()
                    .forEach(entry ->
                            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue())
                    );
        }
    }

