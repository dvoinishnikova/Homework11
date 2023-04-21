package org.example;

import java.util.Iterator;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 3, 5);
        Stream<Integer> second = Stream.of(2, 4, 6);
        Stream<Integer> zipped = zip(first, second);
        zipped.forEach(System.out::println);
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iter1 = first.iterator();
        Iterator<T> iter2 = second.iterator();
        Stream.Builder<T> builder = Stream.builder();

        while (iter1.hasNext() && iter2.hasNext()) {
            builder.accept(iter1.next());
            builder.accept(iter2.next());
        }

        return builder.build();
    }
}
