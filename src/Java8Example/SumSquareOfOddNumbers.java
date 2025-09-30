package Java8Example;

import java.util.Arrays;
import java.util.List;

public class SumSquareOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int sum = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
