package org.example;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
public class Task1 {
    public static String formatNames(List<String> names) {
        return names.stream()
                .filter(name -> names.indexOf(name) % 2 == 0)
                .map(name -> (names.indexOf(name) + 1) + ". " + name)
                .collect(Collectors.joining(", ")); }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "John", "Peter", "Bill", "Max", "Alex");
        System.out.println(formatNames(names));
    }
}
