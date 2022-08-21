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
            Kullanici kullanici = new Kullanici(Kullanici.getToplamBakiye(), Kullanici.getGecenArac());
            if (Otomobil.getAracSinifi().equalsIgnoreCase("Otomobil")) {
                Kullanici.getGecenArac().add(Otomobil.getAracSinifi());
            }
            if (Minibus.getAracSinifi().equalsIgnoreCase("Minibüs")) {
                Kullanici.getGecenArac().add(Minibus.getAracSinifi());
            }
            if (Otobus.getAracSinifi().equalsIgnoreCase("Otobüs")) {
                Kullanici.getGecenArac().add(Otobus.getAracSinifi());
            }
            System.out.println(Kullanici.getGecenArac());
    }


    protected static void toplamBakiye() {
        int toplamBakiye = 0;
        Kullanici kullanici = new Kullanici(Kullanici.getToplamBakiye(), Kullanici.getGecenArac());
            if (Otomobil.getAracSinifi().equalsIgnoreCase("Otomobil")) {
                Otomobil.setBakiye(Otomobil.getBakiye() - 200);
                Kullanici.setToplamBakiye(200);
                toplamBakiye += Kullanici.getToplamBakiye();
            }
            if (Minibus.getAracSinifi().equalsIgnoreCase("Minibüs")) {
                Minibus.setBakiye(Minibus.getBakiye() - 250);
                Kullanici.setToplamBakiye(250);
                toplamBakiye += Kullanici.getToplamBakiye();
            }
            if (Otobus.getAracSinifi().equalsIgnoreCase("Otobüs")) {
                Otobus.setBakiye(Otobus.getBakiye() - 300);
                Kullanici.setToplamBakiye(300);
                toplamBakiye += Kullanici.getToplamBakiye();
            }
            System.out.println("Toplam Bakiye : " + toplamBakiye);
    }
}
