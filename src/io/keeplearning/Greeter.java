package io.keeplearning;

public class Greeter {

    public static void main(String[] args) {
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        Greeter greeter = new Greeter();
        greeter.greet(helloWorldGreeting);
    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }
}
