package hgs;

import java.util.Scanner;

public class Yonetim {

    static Scanner scan = new Scanner(System.in);

    public static void yonetim() {
        System.out.println("   ===========HGS===========\n" +
                "=====Yönetim Bilgi Sistemi=====\n" +
                "\t   1- Günlük Geçiş Yapan Araç\n" +
                "\t   2- Günlük Toplam Bakiye\n" +
                "\t   3- Ana Menü\n" +
                "\t   Q- Çıkış");
        System.out.println("Lütfen seçminizi yapınız");
        String secim = scan.next();
        switch (secim) {
            case "1":
                System.out.println("Toplam Araç : "+Gise.toplamArac);
                yonetim();
                break;
            case "2":
                System.out.println("Toplam Bakiye : "+Gise.toplamBakiye);
                yonetim();
                break;
            case "3":
                Ana_Menu.baslangic();
                break;
            case "q":
            case "Q":
                break;
            default:
                System.out.println("Geçerli bir değer giriniz");
                yonetim();
        }
    }

    private static void gecenArac() {
    }
}
