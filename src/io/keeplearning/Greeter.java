package io.keeplearning;

public class Greeter {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting helloWorldGreeting = new HelloWorldGreeting();

        Greeting lambdaGreeting = () -> System.out.println("Hello World!");

        //Anonymous inner class
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World!");
            }
        };

        greeter.greet(helloWorldGreeting);
        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);
    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }
}
