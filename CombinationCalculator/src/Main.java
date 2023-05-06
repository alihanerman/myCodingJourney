import java.util.Scanner;

public class Main    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the values of n and r
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        // Calculate the factorial of n
        int nFactorial = 1;
        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }

        // Calculate the factorial of r
        int rFactorial = 1;
        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }

        // Calculate the factorial of (n-r)
        int nMinusRFactorial = 1;
        for (int i = 1; i <= n-r; i++) {
            nMinusRFactorial *= i;
        }

        // Calculate the combination
        int combination = nFactorial / (rFactorial * nMinusRFactorial);

        // Print the result to the screen
        System.out.println("C(" + n + "," + r + ") = " + combination);
    }
}
