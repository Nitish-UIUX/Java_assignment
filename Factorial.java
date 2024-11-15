import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        BigInteger factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);

        int sumOfDigits = sumOfDigits(factorial);
        System.out.println("Sum of the digits of the factorial is: " + sumOfDigits);
    }

    public static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static int sumOfDigits(BigInteger number) {
        int sum = 0;
        String numStr = number.toString();
        for (char c : numStr.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
