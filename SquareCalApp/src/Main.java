import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        double pi  = 3.14 , alan , cevre, alpha, area,radians  ;
        Scanner input = new Scanner(System.in);

        System.out.println("yarı capı gir: ");
        r = input.nextInt();

alan = pi * r *r;
cevre= pi * 2 *r ;

        System.out.println("alan : "+ alan);
        System.out.println("cevre: " + cevre);

        System.out.print("Merkez açısının ölçüsünü girin (derece): ");
         alpha = input.nextDouble();


        radians = Math.toRadians(alpha);


        area = (r * r * radians) / 2;

        System.out.println("Daire diliminin alanı: " + area);
    }

}
