package java8examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparatedString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("mama","subha","shree");
        String result = names.stream().collect(Collectors.joining(" , "));
        System.out.println(result);
    }
}
