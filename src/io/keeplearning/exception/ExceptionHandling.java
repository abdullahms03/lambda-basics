package io.keeplearning.exception;

import java.util.function.BiConsumer;

public class ExceptionHandling {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};
        int key = 0;
        process(numbers, key, wrapper((v, k) -> System.out.println("Output : " + (v / k))));
    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int val : numbers) {
            consumer.accept(val, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception handled in wrapper : " + e.getMessage());
            }
        };
    }
}
