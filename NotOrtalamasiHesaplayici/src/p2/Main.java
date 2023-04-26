package p2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int  mat , fizik ,kimya , turkce, tarih ,muzik ;

        Scanner scan = new  Scanner (System.in);
        System.out.println("Mat: ");
 mat = scan.nextInt();
        System.out.println("Fizik: ");
 fizik = scan.nextInt();
        System.out.println("Kimya: ");
 kimya = scan.nextInt();
        System.out.println("Turkçe:  ");
 turkce = scan.nextInt();
        System.out.println("Tarih:  ");
 tarih = scan.nextInt();
        System.out.println("Muzik:  ");
 muzik = scan.nextInt();
        scan.close();
 int result = (mat + fizik + kimya+ turkce + tarih +muzik)/6;
        System.out.println("mat= " +mat + " fizik= " +fizik+ " kimya= " +kimya+ " turkce= " +turkce+ " tarih= " + tarih+ " müzik= "+muzik );
        System.out.println("ortalama: " +result);

        if (result < 60 && result >= 0) {
            System.out.println("Kaldınız");}
        else if( result > 60 && result <101){
            System.out.println("Geçtiniz ");}
        else {
            System.out.println("hata");}


    }
}

