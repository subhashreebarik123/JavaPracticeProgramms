package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNoFileterEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50);

        List<Integer> evenNumber = numbers.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());

        System.out.println(evenNumber);
    }
    }

