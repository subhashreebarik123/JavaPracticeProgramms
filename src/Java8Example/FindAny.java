package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Subha","Subhashree","Mama");
        Optional<String> finAny = names.stream().findAny();

        finAny.ifPresent(System.out::println);
    }
}
