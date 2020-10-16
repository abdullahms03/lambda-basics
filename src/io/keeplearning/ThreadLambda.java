package io.keeplearning;

public class ThreadLambda {

    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inner class");
            }
        });
        myThread.start();

        Thread threadLambda = new Thread(() -> System.out.println("Thread Lambda"));
        threadLambda.start();
    }
}
