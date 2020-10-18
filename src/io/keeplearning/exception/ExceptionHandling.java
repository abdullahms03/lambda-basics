package io.keeplearning.exception;

import java.util.function.BiConsumer;

public class ExceptionHandling {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};
        int key = 0;
        process(numbers, key, (v, k) -> {
            try {
                System.out.println("Output : " + (v / k));
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception occurred : " + e.getMessage());
            }
        });
    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int val : numbers) {
            consumer.accept(val, key);
        }
    }
}
