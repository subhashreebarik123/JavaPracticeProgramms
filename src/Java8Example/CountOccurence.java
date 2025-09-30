package Java8Example;

import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurence {
    public static void main(String[] args) {
        String input = "acabccb";
        Map<Character, Long> count = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(count);
    }
}