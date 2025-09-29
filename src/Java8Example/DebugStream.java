package Java8Example;

import java.util.Arrays;
import java.util.List;

public class DebugStream {

        public static void main(String[] args) {
            List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");

            names.stream()
                    .filter(s -> s.startsWith("J"))
                    .peek(s -> System.out.println("After filter: " + s))
                    .map(String::toUpperCase)
                    .peek(s -> System.out.println("After map: " + s))
                    .forEach(System.out::println);
        }
    }
