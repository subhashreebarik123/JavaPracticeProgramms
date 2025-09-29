package java8examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("mama","subha","shree");
        List<String> uppercase= names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercase);
    }
}
