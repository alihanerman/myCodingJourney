import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " bir palindrom sayıdır.");
        } else {
            System.out.println(number + " bir palindrom sayı değildir.");
        }
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number; // Store the original number

        int reverseNumber = 0; // Variable to store the reverse of the number

        // Reverse the number
        while (number != 0) {
            int remainder = number % 10; // Get the last digit of the number
            reverseNumber = reverseNumber * 10 + remainder; // Add the digit to the reverse number
            number = number / 10; // Remove the last digit from the number
        }

        // Check if the original number is equal to its reverse
        return originalNumber == reverseNumber;
    }
}
