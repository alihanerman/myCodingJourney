import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = input.nextInt();
        int sum  = 0 ;
        // we create temp because we will check n later.
        int temp = n ;
        int digits = 0;

        //counting the number of digits  in the input number.
        while (temp !=0){
            digits++;
            temp /=10;
        }

        //Summing up the cubes of individual digits.
        temp = n;
        while (temp !=0){
            int d =  temp %10;
            int c = 1;
            for (int i = 1; i <= digits ; i++) {
                c *= d ;
            }
            sum += c;
            temp /= 10;
        }
        //Checking if the number is an Armstrong number.

        if (n ==sum){
            System.out.println(n + " yes it is");
        } else System.out.println(n+ " nope is not");
    }

}
