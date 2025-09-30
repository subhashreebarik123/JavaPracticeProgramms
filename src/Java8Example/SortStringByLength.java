package Java8Example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringByLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alexander", "Bob", "Tom");
        names.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}
