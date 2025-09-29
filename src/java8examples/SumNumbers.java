package java8examples;

import java.util.Arrays;
import java.util.List;

public class SumNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,32,76,53,87,59);
         int sum = numbers.stream().mapToInt(Integer::intValue).sum();
         System.out.println(sum);
    }
}
