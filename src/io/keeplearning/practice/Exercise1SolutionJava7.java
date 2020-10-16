package io.keeplearning.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise1SolutionJava7 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );

        // Sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        // Create a method to print all elements in the list
        System.out.println("\nPrint all persons with provided Condition - condition is always 'true', print all the items");
        printWithCondition(people, new Condition() {
            @Override
            public boolean evaluate(Person person) {
                return true;
            }
        });

        // Create a method to print all people that have last name beginning with C
        System.out.println("\nPrint all persons with provided Condition - Last name starts with 'C' ");
        printWithCondition(people, new Condition() {
            @Override
            public boolean evaluate(Person person) {
                return person.getLastName().startsWith("C");
            }
        });

        System.out.println("\nPrint all persons with provided Condition - First name starts with 'C' ");
        printWithCondition(people, new Condition() {
            @Override
            public boolean evaluate(Person person) {
                return person.getFirstName().startsWith("C");
            }
        });
    }

    private static void printWithCondition(List<Person> people, Condition condition) {
        for (Person person : people) {
            if(condition.evaluate(person))
                System.out.println(person);
        }
    }
}

interface Condition {
    boolean evaluate(Person person);
}