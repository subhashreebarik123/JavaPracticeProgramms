package java8examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenIntoString {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Java", "Spring"),
                Arrays.asList("Docker", "Kubernetes"),
                Arrays.asList("AI", "ML")
        );

        List<String> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattenedList);
    }

    }
