import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// Create a Scanner object to read input from the user
        System.out.print("Enter a number: ");
        int num = input.nextInt(); // Read the number from the user

        double harmonicSum = 0; // Declare a variable to store the sum of the harmonic series

        // Loop from 1 to the given number
        for (int i = 1; i <= num; i++) {
            harmonicSum += (double) 1 / i; // Add the reciprocal of the current loop variable to the harmonic sum
        }

        // Print the harmonic series of the given number to the console
        System.out.println("Harmonic series of " + num + " is " + harmonicSum);
    }
}
