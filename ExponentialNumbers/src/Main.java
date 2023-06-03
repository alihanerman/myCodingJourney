import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base value: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent value: ");
        int exponent = scanner.nextInt();

        int result = exponentiation(base, exponent);
        System.out.println("Result: " + result);
    }

    // Recursive method to perform exponentiation
    public static int exponentiation(int base, int exponent) {
        if (exponent == 0)
            return 1;
        else if (exponent == 1)
            return base;
        else
            return base * exponentiation(base, exponent - 1);
    }
}
