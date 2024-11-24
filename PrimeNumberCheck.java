public class PrimeNumberCheck {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }
        return true; // If no divisors were found, it is prime
    }

    public static void main(String[] args) {
        // Predefined number to check (this is where the "user-defined" input is in the code)
        int number = 29;  // You can change this value to any number you'd like to check

        // Check if the number is prime and print the result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
