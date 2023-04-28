import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Manavdan aldığınız ürünleri ve kilogram değerlerini giriniz:");

        System.out.print("Armut (kg): ");
        double armutKg = input.nextDouble();

        System.out.print("Elma (kg): ");
        double elmaKg = input.nextDouble();

        System.out.print("Domates (kg): ");
        double domatesKg = input.nextDouble();

        System.out.print("Muz (kg): ");
        double muzKg = input.nextDouble();

        System.out.print("Patlıcan (kg): ");
        double patlicanKg = input.nextDouble();

        double armutTutar = armutKg * 2.14;
        double elmaTutar = elmaKg * 3.67;
        double domatesTutar = domatesKg * 1.11;
        double muzTutar = muzKg * 0.95;
        double patlicanTutar = patlicanKg * 5.00;

        double toplamTutar = armutTutar + elmaTutar + domatesTutar + muzTutar + patlicanTutar;

        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    }
}
