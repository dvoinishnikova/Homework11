package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;
public class Task2 {
    public static List<String> sortAndUpperCase(List<String> inputList) {
        return inputList.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "John", "Peter", "Bill", "Max", "Alex");
        System.out.println(sortAndUpperCase(names));
    }
}
