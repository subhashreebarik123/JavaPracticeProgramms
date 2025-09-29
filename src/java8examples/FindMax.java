package java8examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,32,76,53,87,59);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        System.out.println(max);
    }
}
