package java8examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartiotionEvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,32,76,53,87,59);
        Map<Boolean,List<Integer>> partiotionByLength = numbers.stream().collect(Collectors.partitioningBy((n->n%2==0)));

        System.out.println("PartitionedBy Length : " + partiotionByLength.get(true));
        System.out.println("PartitionedBy Length : " + partiotionByLength.get(false));
    }
}
