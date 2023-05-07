import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the triangle: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            // Loop to print spaces before the stars
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }

            // Loop to print stars for each row
            for (int k = 0; k <= (2 * i); k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }


        System.out.println("------------------  DİAMOND SHAPE   -----------------------------");

        // Print the upper half of the diamond
        for (int i = 0; i < size; i++) {
            // Loop to print spaces before the stars
            for (int j = size - i; j > 1; j--) {
                System.out.print(" ");
            }

            // Loop to print stars for each row
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }

        // Print the lower half of the diamond
        for (int i = size - 1; i >= 0; i--) {
            // Loop to print spaces before the stars
            for (int j = size - i; j > 1; j--) {
                System.out.print(" ");
            }

            // Loop to print stars for each row
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}