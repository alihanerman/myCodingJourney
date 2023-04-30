import java.util.Scanner;

public class GecmeKalmaApp {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ders notlarını kullanıcıdan al
            System.out.println("Matematik notunu girin: ");
            int matematikNotu = scanner.nextInt();

            System.out.println("Fizik notunu girin: ");
            int fizikNotu = scanner.nextInt();

            System.out.println("Türkçe notunu girin: ");
            int turkceNotu = scanner.nextInt();

            System.out.println("Kimya notunu girin: ");
            int kimyaNotu = scanner.nextInt();

            System.out.println("Müzik notunu girin: ");
            int muzikNotu = scanner.nextInt();

            // Girilen notların 0-100 aralığında olup olmadığını kontrol et
            boolean matematikGecerli = matematikNotu >= 0 && matematikNotu <= 100;
            boolean fizikGecerli = fizikNotu >= 0 && fizikNotu <= 100;
            boolean turkceGecerli = turkceNotu >= 0 && turkceNotu <= 100;
            boolean kimyaGecerli = kimyaNotu >= 0 && kimyaNotu <= 100;
            boolean muzikGecerli = muzikNotu >= 0 && muzikNotu <= 100;

            // Geçersiz notlar için kullanıcıya uyarı ver
            if (!matematikGecerli || !fizikGecerli || !turkceGecerli || !kimyaGecerli || !muzikGecerli) {
                System.out.println("Girilen notların 0-100 aralığında olduğundan emin olun.");
                return;
            }

            // Notların ortalamasını hesapla
            double ortalama = (matematikNotu + fizikNotu + turkceNotu + kimyaNotu + muzikNotu) / 5.0;

            // Ortalamaya göre öğrencinin durumunu belirle
            if (ortalama >= 55) {
                System.out.println("Öğrenci dersleri geçti.");
            } else {
                System.out.println("Öğrenci dersleri geçemedi.");
            }
        }
    }

