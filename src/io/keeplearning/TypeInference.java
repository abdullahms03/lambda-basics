package io.keeplearning;

public class TypeInference {

    public static void main(String[] args) {
        StringLambda lambda = s -> s.length();
        System.out.println(lambda.getLength("Lambda"));
    }

    interface StringLambda {
        int getLength(String s);
    }
}
