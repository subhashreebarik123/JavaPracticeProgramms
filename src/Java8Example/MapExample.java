package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
    List<String> names = Arrays.asList("john", "alice", "bob");

    List<String> upperNames = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

    System.out.println(upperNames);
}
}
