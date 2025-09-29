package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {public static void main(String[] args) {
    List<String> names = Arrays.asList("John", "Alice", "Bob");


    Optional<String> firstName = names.stream().findFirst();

    firstName.ifPresent(System.out::println);
}
}
