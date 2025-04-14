public class ThrowThrows {

    // This method declares that it might throw an exception
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            // Throwing an exception manually using 'throw'
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);  // This will cause an exception to be thrown
        } catch (ArithmeticException e) {
            // Catching the thrown exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
