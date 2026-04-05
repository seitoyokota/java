public class Calculator {

    /**
     * Adds two numbers.
     * @param a The first number.
     * @param b The second number.
     * @return The sum of a and b.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first.
     * @param a The first number.
     * @param b The second number.
     * @return The difference between a and b.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     * @param a The first number.
     * @param b The second number.
     * @return The product of a and b.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second.
     * @param a The numerator.
     * @param b The denominator.
     * @return The quotient of a and b.
     * @throws IllegalArgumentException if the denominator (b) is zero.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Error: Cannot divide by zero.");
        }
        return a / b;
    }
}