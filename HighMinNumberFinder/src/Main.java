import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = input.nextInt();

        int firstNum = input.nextInt(); // read the first number
        int max = firstNum;
        int min = firstNum;

        //n number entering loop.
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter the " + i + ". number: ");
            int num = input.nextInt();

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("The largest number is: " + max);
        System.out.println("The smallest number is: " + min);


    }
}
