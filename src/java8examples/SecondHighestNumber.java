package java8examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,32,76,53,87,59);
        Integer secondHighestNo = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(secondHighestNo);
    }
}
