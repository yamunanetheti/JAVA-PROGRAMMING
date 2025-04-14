public class TryCatchDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result;

        try {
            // This line may throw an ArithmeticException
            result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // This block handles the exception
            System.out.println("Exception caught: Division by zero is not allowed.");
        }

        System.out.println("Program continues after the try-catch block.");
    }
}
