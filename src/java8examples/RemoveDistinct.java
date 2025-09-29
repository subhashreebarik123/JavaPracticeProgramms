package java8examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,3,3,7,5,7,9,4);
        List<Integer> removeDistinct = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println(removeDistinct);
    }
}
