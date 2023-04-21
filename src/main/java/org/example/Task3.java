package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;
public class Task3 {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        System.out.println(digitSort(array));
    }
    public static String digitSort(String[] array) {
        String result = Arrays
                .stream(array)
                .map(s -> s.split(",\\s*"))
                .flatMap(Arrays::stream)
                .map(Integer::valueOf)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        return result;
    }
}
