import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get the two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // initialize the GCD and a counter variable
        int gcd = 1;
        int i = 1;

        // use a while loop to find the GCD
        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }

        // calculate the LCM using the GCD
        int lcm = (num1 * num2) / gcd;

        // print out the results
        System.out.println("The GCD of the two numbers is: " + gcd);
        System.out.println("The LCM of the two numbers is: " + lcm);
    }
}

