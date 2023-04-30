import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int  firstN,secondN ;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        firstN = input.nextInt();
        System.out.print("Enter Second Number: ");
        secondN= input.nextInt();

        System.out.print("Yapmak istediğiniz işlemi giriniz 1-Toplama, 2-Çıkarma, 3-Çarpma ,4-Bölme:  ");
        byte cal = input.nextByte();

        switch (cal) {

            case 1:
                int toplam = firstN + secondN;
                System.out.println("Toplam: "+ toplam);

                break;
            case 2:
                int cıkarma = firstN -secondN;
                System.out.println("Cıkarma: "+ cıkarma);

                break;
            case 3:
                int carpma = firstN * secondN;
                System.out.println("Çarpma: "+ carpma);

                break;
            case 4:
                int bolme = firstN / secondN;
                System.out.println("Bölme: "+ bolme);

                break;
            default:
        }



    }
}
