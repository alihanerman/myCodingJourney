import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        double km , kmTl  , minVal , openVal ,result , total, kmPer
                ;
        openVal = 10.0 ;
        minVal = 20.0;
        kmPer = 2.20;

        Scanner kmImp  =  new Scanner(System.in);
        System.out.println("Km girişi: ");
        km = kmImp.nextDouble();

        kmTl = km* kmPer ;

 result = kmTl + openVal;

        total = Math.max(result, minVal);

        System.out.println("Price: " + total);



    }
}
