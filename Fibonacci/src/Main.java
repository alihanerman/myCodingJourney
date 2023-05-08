import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the number of elements in the Fibonacci series
        System.out.print("Enter the number of elements in the Fibonacci series: ");
        int n = input.nextInt();

        int a = 0, b = 1;

        // Calculate and print the Fibonacci series
        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

    }
}

