package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {
        List<List<String>> names = Arrays.asList(Arrays.asList("A","B"),Arrays.asList("C","D"),Arrays.asList("E","F"));


        List<String> flatMap = names.stream().flatMap(List::stream).collect(Collectors.toList());


        System.out.println(flatMap);
    }
}
