import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // take number from user.
        Scanner input = new Scanner(System.in);
        System.out.println("Number: ");
        int n = input.nextInt();

// Power of two
        System.out.println("power of 2 ---");
        for (int i = 1; i <= n; i *= 2) System.out.println(i);

        // power of four
        System.out.println("power of 4 ---");
        for (int i = 1; i <= n; i *= 4) System.out.println(i);
        // power of five
        System.out.println("power of 5 ---");
        for (int i = 1; i <= n; i *= 5) System.out.println(i);

    }

}
