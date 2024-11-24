import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        // Scanner to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the number to check
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Check if the number is prime
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        
        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // A prime number is greater than 1 and is divisible only by 1 and itself
        if (n <= 1) {
            return false;
        }

        // Check divisibility from 2 to the square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a divisor, so n is not prime
            }
        }

        return true; // No divisors found, so n is prime
    }
}
