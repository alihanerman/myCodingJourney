import java.util.Scanner;
public class EtkinlikApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz: ");
        int sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapmayı öneririm.");
        } else if (sicaklik < 15) {
            System.out.println("Sinema etkinliğini öneririm.");
        } else if (sicaklik < 25) {
            System.out.println("Piknik etkinliğini öneririm.");
        } else {
            System.out.println("Yüzme etkinliğini öneririm.");
        }


    }
}
