package Java8Example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);
        int secondHighest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondHighest);
    }
}