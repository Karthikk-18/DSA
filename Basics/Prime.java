import java.util.Scanner;

public class Prime {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = scanner.nextInt();

        // Returning true if it is PRIME && False Otherwise.
        System.out.println(isPrime(num));
        
        scanner.close();
    }

    public static Boolean isPrime(int num){
        // Handle edge cases: 0, 1, and negative numbers are not prime.
        if (num <= 1) {
            return false;
        }

        // 2 is the only even prime number.
        if (num == 2) {
            return true;
        }

        // If n is even and greater than 2, it's not prime.
        if (num % 2 == 0) {
            return false;
        }

        // Check for divisibility from 3 up to the square root of n,
        // incrementing by 2 to check only odd divisors.
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false; // Found a divisor, so it's not prime.
            }
        }

        return true; // No divisors found, so it's prime.
    }
}
