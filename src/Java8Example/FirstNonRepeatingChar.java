package Java8Example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "swiss";
        Character result = input.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(result);
    }
}
