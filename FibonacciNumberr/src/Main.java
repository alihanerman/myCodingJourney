import java.util.Scanner;

public class Main {
    // Recursive function to calculate the Fibonacci number
    public static int fibo(int N) {
        // Base cases: Fibonacci numbers for N=0 and N=1 are 0 and 1 respectively
        if (N <= 1)
            return N;

        // Recursive calls to calculate the Nth Fibonacci number
        return fibo(N - 1) + fibo(N - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt(); // Read the value of n from user input

        int result = fibo(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);


    }
}
