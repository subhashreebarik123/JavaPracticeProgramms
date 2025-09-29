package java8examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("mama","subha","shree" , "SubhashreeBarik","Subhashree");
        String concatenateStringByLength = names.stream().filter(s->s.length()>5).collect(Collectors.joining(" , "));
     System.out.println(concatenateStringByLength);
    }
}
