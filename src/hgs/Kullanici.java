package hgs;

import java.time.LocalDateTime;
import java.util.*;

public class Kullanici {
    static String hgsNo;
    static String isim;
    static String soyIsim;
    static String aracSinifi;
    static String[] kullaniciBilgi;
    static int bakiye;
    static Map<String, String> kullaniciMap = new HashMap<>();
    static Set<Map.Entry<String, String>> kullaniciSet = kullaniciMap.entrySet();
    static Scanner scan = new Scanner(System.in);

    public static void kullanici() {
        System.out.println("   ===========HGS===========\n" +
                "=====Kullanıcı Bilgi Sistemi=====\n" +
                "\t   1- Kullanıcı Ekleme\n" +
                "\t   2- Kullanıcı Bilgi Sorgulama\n" +
                "\t   3- Ana Menü\n" +
                "\t   Q- Çıkış");
        System.out.println("Lütfen seçminizi yapınız");
        String secim = scan.next();
        switch (secim) {
            case "1":
                kullaniciEkle();
                kullanici();
                break;
            case "2":
                bilgiSorgulama();
                kullanici();
                break;
            case "3":
                Ana_Menu.baslangic();
                break;
            case "q":
            case "Q":
                break;
            default:
                System.out.println("Geçerli bir değer giriniz");
                kullanici();
        }
    }

    public static void kullaniciEkle() {
        System.out.println("HGS No");
        hgsNo = scan.next();
        System.out.println("İsim");
        scan.nextLine();
        isim = scan.nextLine();
        System.out.println("Soyisim");
        soyIsim = scan.nextLine();
        System.out.println("Araç Sınıfı");
        aracSinifi = scan.next();
        System.out.println("Bakiye");
        bakiye = scan.nextInt();
        String eklenecekValue = isim + ", " + soyIsim + ", " + aracSinifi;
        kullaniciMap.put(hgsNo, eklenecekValue);
        for (Map.Entry<String, String> w : kullaniciSet) {
            hgsNo = w.getKey();
            kullaniciBilgi = w.getValue().split(", ");
            System.out.println(hgsNo + " " + kullaniciBilgi[0] + " " + kullaniciBilgi[1] + " " + kullaniciBilgi[2]);
        }
    }

    public static void bilgiSorgulama() {
        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("Sorgulamak istediğiniz kullanıcını HGS No giriniz");
        String arananHgsNo = scan.next();
        for (Map.Entry<String, String> w : kullaniciSet) {
            hgsNo = w.getKey();
            kullaniciBilgi = w.getValue().split(", ");
            if (arananHgsNo.equals(hgsNo)) {
                System.out.println(hgsNo + " " + kullaniciBilgi[0] + " " + kullaniciBilgi[1] + " " + kullaniciBilgi[2]);
                System.out.println("Tarih : " + tarihSaat.getYear() + "-" + tarihSaat.getMonth() + "-" + tarihSaat.getDayOfMonth() + "\nSaat : " + tarihSaat.getHour() + ":" + tarihSaat.getMinute() + ":" + tarihSaat.getSecond());
                Gise.kullaniciBakiye();
            }
        }
        if (!arananHgsNo.equals(hgsNo)) {
            System.out.println("Aradığınız HGS No'da kullanıcı yok");
        }
    }
}
