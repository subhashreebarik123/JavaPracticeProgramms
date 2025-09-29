package java8examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNull {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("mama",null, "subha","","shree"," ");
       List<String> removeNull = names.stream().filter(s->s !=null && !s.trim().isEmpty()).collect(Collectors.toList());

       System.out.println(removeNull);
    }
}
