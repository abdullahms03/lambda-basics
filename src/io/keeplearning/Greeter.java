package io.keeplearning;

public class Greeter {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

        Greeting printLambda = () -> System.out.println("Hello World ! ");
        greeter.greet(printLambda);
        printLambda.perform();

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World ! ");
            }
        };
        innerClassGreeting.perform();
    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }
}
