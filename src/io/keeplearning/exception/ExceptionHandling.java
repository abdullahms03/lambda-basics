package io.keeplearning.exception;

import java.util.function.BiConsumer;

public class ExceptionHandling {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};
        int key = 0;
        process(numbers, key, (v, k) -> System.out.println("Output : " + (v / k)));
    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int val : numbers) {
            try {
                consumer.accept(val, key);
            } catch (ArithmeticException e) {
                // The behaviour passed can be anything, so handling specific exception here is not a advisable option
                System.out.println("Arithmetic exception occurred : " + e.getMessage());
            }
        }
    }
}
