package hgs;

import java.time.LocalDate;
import java.time.LocalTime;

public class Otomobil {
    private static String isim;
    private static String soyIsim;
    private static String aracSinifi;
    private static String hgsNo;
    private static int bakiye;
    private static LocalDate tarih=LocalDate.now();
    private static LocalTime saat=LocalTime.now();
    @Override
    public String toString() {
        return "İsim :"+isim+"\n"+
                "Soyisim : "+soyIsim+"\n"+
                "Araç Sınıfı : "+aracSinifi+"\n"+
                "HGS No : "+hgsNo+"\n"+
                "Bakiye : "+bakiye+"\n"+
                "Tarih : "+tarih+"\n"+
                "Saat : "+saat+"\n";
    }

    public Otomobil(String isim, String soyIsim, String aracSinifi, String hgsNo, int bakiye) {
        this.isim = isim;
        this. soyIsim = soyIsim;
        this. aracSinifi = aracSinifi;
        this. hgsNo = hgsNo;
        this. bakiye = bakiye;
    }

    public Otomobil() {
    }

    public static String getIsim() {
        return isim;
    }

    public static void setIsim(String isim) {
        Otomobil.isim = isim;
    }

    public static String getSoyIsim() {
        return soyIsim;
    }

    public static void setSoyIsim(String soyIsim) {
        Otomobil.soyIsim = soyIsim;
    }

    public static String getAracSinifi() {
        return aracSinifi;
    }

    public static void setAracSinifi(String aracSinifi) {
        Otomobil.aracSinifi = aracSinifi;
    }

    public static String getHgsNo() {
        return hgsNo;
    }

    public static void setHgsNo(String hgsNo) {
        Otomobil.hgsNo = hgsNo;
    }

    public static int getBakiye() {
        return bakiye;
    }

    public static void setBakiye(int bakiye) {
        Otomobil.bakiye = bakiye;
    }
}
