package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class JavaSolution {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 6, 1, 6, 4, 3, 1, 6, 4, 5);
        Map<Integer, Long> result = numbers.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        result.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
