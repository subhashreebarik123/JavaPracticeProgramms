package Java8Example;

import java.util.stream.Collectors;

public class ReverseString {
        public static void main(String[] args) {
            String input = "hello";

            String reversed = new StringBuilder(
                    input.chars()
                            .mapToObj(c -> (char)c)
                            .map(Object::toString)
                            .collect(Collectors.joining())
            ).reverse().toString();

            System.out.println(reversed);
        }
    }

