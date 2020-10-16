package io.keeplearning;

public class Greeter {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting helloWorldGreeting = new HelloWorldGreeting();
        helloWorldGreeting.perform();

        Greeting lambdaGreeting = () -> System.out.println("Hello World!");
        lambdaGreeting.perform(); // execute lambda

        //Anonymous inner class
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World!");
            }
        };
        innerClassGreeting.perform();
    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }
}
