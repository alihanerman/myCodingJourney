import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static int primeNumber(int number, int divisor) {

        if (number < 2) return  0;
        else if (divisor == 1) return 1;
        else if (number % divisor == 0) return 0;
        return primeNumber(number,divisor-1);


    }
    public static void main(String[] args) {
        System.out.println( primeNumber(14,2));
    }

}

