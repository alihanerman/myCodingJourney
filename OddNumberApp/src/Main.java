import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


   int n;
   int result = 0;

        Scanner input = new Scanner(System.in);

do {
    System.out.println("Please enter number: ");
    n = input.nextInt();

    if (n % 2 == 1) {
        result += n;

    }

} while (n > 0);

        System.out.println( "result: " + result);


/* homework practice
        do {
            System.out.println("Please enter number: ");
            n = input.nextInt();

            if (n  % 4 == 0  ) {
                result += n;

            }

        } while (n  % 2 == 0);

        System.out.println( "result: " + result);
*/
    }

}
