package hgs;

import java.util.Scanner;


public class Yonetim extends Kullanici {
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
                Yonetim.gecenArac();
                yonetim();
                break;
            case "2":
                toplamBakiye();
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

    protected static void gecenArac() {

        System.out.println("Toplam Geçen Araç : " + gecenArac);
    }


    protected static void toplamBakiye() {

        System.out.println("Toplam Bakiye : " + toplamBakiye);
    }
}
