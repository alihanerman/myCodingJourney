import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName,password,passCheck;

     passCheck = "1234";

        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        userName = input.next();
        System.out.print("Password: ");
        password = input.next();


       switch (userName){
           case "admin" :
               System.out.println("Correct Username");
            break;
           default:
               System.out.println( "Wrong Username !!");

        }

        if (!passCheck.equals(password)) {
            System.out.print("Şifre yanlış. Şifrenizi sıfırlamak ister misiniz? [E/H]: ");
            String resetPassword = input.next();

            if (resetPassword.equalsIgnoreCase("E")) {
                while (true) {
                    System.out.print("Yeni şifrenizi giriniz: ");
                    String newPassword = input.next();

                    if (newPassword.equals(password)) {
                        System.out.println("Hata: Yeni şifreniz, eski şifrenizle aynı olamaz. Lütfen başka bir şifre giriniz.");
                    } else {

                        System.out.println("Şifre oluşturuldu.");
                        break;
                    }
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        } else {
            System.out.println("Giriş başarılı.");
        }

    }
}