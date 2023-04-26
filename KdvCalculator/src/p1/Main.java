package p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price;

        Scanner girdi = new Scanner(System.in);
        System.out.println("Fiyat:");
        price = girdi.nextDouble();

        double kdvEighteen =  (price/100)*18;
        double kdvSekiz =  (price/100)*8 ;

        double kdvLee = (price > 1000.0) ? (price + kdvSekiz) : (price + kdvEighteen)
        ;
        System.out.println("kdvli fiyatı = "+ kdvLee);
    }
}