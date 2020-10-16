package io.keeplearning.practice;

import java.util.Arrays;
import java.util.Collections;
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
        Collections.sort(people);

        // Create a method to print all elements in the list
        printAll(people);

        // Create a method to print all people that have last name beginning with C
        printLastNameStartsWithC(people);
    }

    private static void printAll(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static void printLastNameStartsWithC(List<Person> people) {
        for (Person person : people) {
            if(person.getLastName().startsWith("C"))
                System.out.println(person);
        }
    }
}
