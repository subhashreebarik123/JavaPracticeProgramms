package Java8Example;

import java.util.Map;
import java.util.stream.Collectors;

public class CharFrequency {
    public static void main(String[] args) {

                String input = "acabccb";
                Map<Character, Long> freqMap = input.chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(
                                c -> c,
                                Collectors.counting()
                        ));

                freqMap.forEach((k,v) -> System.out.println(k + " : " + v));
            }
        }
