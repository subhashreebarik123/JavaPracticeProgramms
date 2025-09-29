package java8examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,32,76,53,87,59);
        List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
