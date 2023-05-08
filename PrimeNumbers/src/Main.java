public class Main {
    public static void main(String[] args) {
        // Loop through all numbers between 1 and 100
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            // Check if the number is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print the prime number
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

