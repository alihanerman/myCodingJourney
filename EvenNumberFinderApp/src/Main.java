import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // userNumber input
        System.out.print("Please enter number: ");
        int n = input.nextInt();
        int sum = 0;
        int count = 0;


        //print  EvenNumbers until  user input
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Homework average of multiples of 3 and 4 numbers.


        System.out.println("-----------------------------------------------------------");

        for (int j = 1; j < n; j++) {
            if (j % 3 == 0 && j % 4 == 0) {

                sum += j;
                System.out.println(sum);
                count++;
                System.out.println(count);


            }
        }

        //we need at least 2 numbers for average.
if( count > 1 ){
        int average = sum / count;
        System.out.println(average);
} else {
    System.out.println("can't take average ");
}
    }
}
