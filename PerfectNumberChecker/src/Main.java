import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        // Initialize the sum of factors to 0
        int sum = 0;

        // Check all numbers from 1 up to half of the given number
        for (int i = 1; i <= num / 2; i++) {
            // If i is a factor of num, add it to the sum
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of factors is equal to the given number
        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }


    }
}
