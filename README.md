Java8 Lambda basics
-------------------
Functional Programming in Java !

Functions as values

- Use the concept of interface to declare a lambda expression
- Create an interface with a method matching the signature of the lambda - Interface name and method name has no significance
- If an interface of same structure already available, it can be reused for any number of lambdas matching the signature
- Lambda expression can be assigned to a variable, and that value can be passed and executed

Below is an example for method to Lambda expression
- Access modifier not required, as it is not bound to a class
- Method name not required, since lambda expression can be assigned to a variable, variable name suffices
- Return type not required, compiler understands the return type of the function
```
public void perform() {
   System.out.println("Hello World!");
}

perform = () -> System.out.println("Hello World!");
 
 ```
###### Type Inferencth
Since the interface has the method signature already defined, the type of input argument(s) is/are not required.

#### Functional Interface
- Interface with only one abstract method
- `@FunctionalInterface` annotation can be used to make it explicitly visible. Not mandatory, but best practice!

- Java 8 has set of interfaces introduced under package `java.util.function` e.g. `java.util.function.Predicate`

#### Exception Handling
- Creating a wrapper and handling the exception there is ONE of the option