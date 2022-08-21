package hgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kullanici {
    static Scanner scan = new Scanner(System.in);
    static List<String> gecenArac = new ArrayList<>();
    static int toplamBakiye;

    @Override
    public String toString() {
        return "Toplam Bakiye :" + toplamBakiye + "\n" +
                "Geçen Araç :" + gecenArac;
    }

    public Kullanici(int toplamBakiye, List<String> gecenArac) {
        this.toplamBakiye = toplamBakiye;
        this.gecenArac = gecenArac;
    }

    public Kullanici() {
    }

    public static List<String> getGecenArac() {
        return gecenArac;
    }

    public static void setGecenArac(List<String> gecenArac) {
        Kullanici.gecenArac = gecenArac;
    }

    public static int getToplamBakiye() {
        return toplamBakiye;
    }

    public static void setToplamBakiye(int toplamBakiye) {
        Kullanici.toplamBakiye = toplamBakiye;
    }

    protected static void kalanBakiye() {
        System.out.println("Bilgilerini öğrenmek istedeğiniz kullanıcının HGS No giriniz");
        String araHgsNo = scan.next();
        if (Otomobil.getAracSinifi().equalsIgnoreCase("Otomobil")) {
            Otomobil.setBakiye(Otomobil.getBakiye() - 200);
            System.out.println(Gise.toplamList.get(0));
        }
        else if (Minibus.getAracSinifi().equalsIgnoreCase("Minibüs")) {
            Minibus.setBakiye(Minibus.getBakiye() - 250);
            System.out.println(Gise.toplamList.get(0));
        }
        else if (Otobus.getAracSinifi().equalsIgnoreCase("Otobüs")) {
            Otobus.setBakiye(Otobus.getBakiye() - 300);
            System.out.println(Gise.toplamList.get(0));
        }
    }
}