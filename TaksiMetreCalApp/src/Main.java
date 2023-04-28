import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        double km , kmTl  , minVal , openVal ,result , total;

        Scanner kmImp  =  new Scanner(System.in);
        System.out.println("Km girişi: ");
        km = kmImp.nextDouble();

        kmTl = km* 2.20 ;
        openVal = 10.0 ;
        minVal = 20.0;
 result = kmTl + openVal;

        total =  result < minVal ? 20 : result ;

        System.out.println("Price: " + total);



    }
}
