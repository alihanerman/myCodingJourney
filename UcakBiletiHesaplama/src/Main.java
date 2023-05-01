import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan verileri al
        System.out.print("Mesafe (KM): ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınız: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk Tipi (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();


        // Verilerin doğruluğunu kontrol
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        // Bilet fiyatını hesapla
        double biletFiyati = mesafe * 0.10;

        // İndirimleri uygula
        if (yas < 12) {
            biletFiyati *= 0.5;
        } else if (yas <= 24) {
            biletFiyati *= 0.9;
        } else if (yas >= 65) {
            biletFiyati *= 0.7;
        }

// 2 ile çarpıyoruz çünkü aldığımız bilet sayısı 2
        if (yolculukTipi == 2) {
            biletFiyati = (biletFiyati* 0.8)*2;
        }

        // Sonuçları yazdır
        System.out.printf("Toplam Tutar: %.2f TL", biletFiyati);
    }
}
