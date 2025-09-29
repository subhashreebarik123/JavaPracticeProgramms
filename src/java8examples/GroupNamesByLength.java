package java8examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNamesByLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("mama","subha","shree" , "SubhashreeBarik","Subhashree");
        Map<Integer,List<String>> length = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(length);
    }
}
