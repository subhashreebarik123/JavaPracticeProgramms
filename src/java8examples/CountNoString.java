package java8examples;

import java.util.Arrays;
import java.util.List;

public class CountNoString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("mama","subha","shree","subhashree");
        long count =  names.stream().filter(s->s.length()>5).count();
        System.out.println(count);
    }
}
