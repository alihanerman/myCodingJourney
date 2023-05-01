import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        b = input.nextInt();
        System.out.print("son sayıyı giriniz: ");
        c = input.nextInt();

        // Biggest First
        if (a > b && a > c) {
            System.out.print(a + " > ");
            if (b > c) {
                System.out.println(b + " > " + c);
            } else System.out.println(c + " > " + b);

        }
        // Biggest Second
        else if (b > a && b > c) {
            System.out.print(b + " > ");
            if (a > c) {
                System.out.println(a + " > " + c);
            } else System.out.println(c + " > " + a);

        }
        // Biggest Third
        else if (c > a && c > b) {
            System.out.print(c + " > ");
            if (b > a) {
                System.out.println(b + " > " + a);
            } else System.out.println(a + " > " + b);
        } else {
            System.out.println("hata");
        }
    }
}