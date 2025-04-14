// Functional interface (only one abstract method)
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        // Lambda expression for addition
        MathOperation addition = (a, b) -> a + b;

        // Lambda expression for subtraction
        MathOperation subtraction = (a, b) -> a - b;

        // Lambda expression for multiplication
        MathOperation multiplication = (a, b) -> a * b;

        // Lambda expression for division
        MathOperation division = (a, b) -> {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
                return 0;
            }
            return a / b;
        };

        // Using the lambda expressions
        System.out.println("Addition: " + addition.operate(10, 5));
        System.out.println("Subtraction: " + subtraction.operate(10, 5));
        System.out.println("Multiplication: " + multiplication.operate(10, 5));
        System.out.println("Division: " + division.operate(10, 5));
    }
}
