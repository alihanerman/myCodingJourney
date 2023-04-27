import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a ,b ;
        double c;
        Scanner giris = new Scanner(System.in);
        System.out.println("a:");
        a = giris.nextInt();
        System.out.println("b:");
        b = giris.nextInt();


        c = Math.sqrt((a*a)+(b*b));
        System.out.println("hipoyenus: c" + c);



        double cevre = a+b+c ;
       int alan = (a * b ) / 2 ;

    System.out.println(cevre);
        System.out.println(alan);




    }
}
