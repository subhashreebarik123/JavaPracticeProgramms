package java8examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("mama", "subha", "shree", "SubhashreeBarik", "Subhashree");
          List<String> sortedString = names.stream().sorted(Comparator.comparingInt(String::length)).toList();
          System.out.println(sortedString);
    }
}
