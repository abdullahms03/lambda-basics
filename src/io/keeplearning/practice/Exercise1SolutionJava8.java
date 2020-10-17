package io.keeplearning.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Exercise1SolutionJava8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );

        // Sort list by last name
        people.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Create a method to print all elements in the list
        System.out.println("\nPrint all persons with provided Condition - condition is always 'true', print all the items");
        performWithCondition(people, person -> true, p -> System.out.println(p));

        // Create a method to print all people that have last name beginning with C
        System.out.println("\nPrint all persons with provided Condition - Last name starts with 'C' ");
        performWithCondition(people, person -> person.getLastName().startsWith("C"), p -> System.out.println(p));

        System.out.println("\nPrint all persons with provided Condition - First name starts with 'C' ");
        performWithCondition(people, person -> person.getFirstName().startsWith("C"), p -> System.out.println(p));
    }

    private static void performWithCondition(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person : people) {
            if (predicate.test(person))
                consumer.accept(person);
        }
    }
}
