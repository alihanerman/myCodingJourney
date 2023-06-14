import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        recur(num);
    }

    // Recursive function to print the numbers
    public static void recur(int num) {
        int first = num;

        if (num > 0) {
            num -= 5;
            System.out.print(" " + first);  // Print the current number

            recur(num);  // Recursive call with the decreased number

            // Note: The below line is executed when the recursive calls have completed.
            // It prints the current number again, but this time in reverse order as the recursion unwinds.
        }

        System.out.print(" " + first);  // Print the current number again after recursion
    }
}

