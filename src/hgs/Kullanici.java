package hgs;

import java.util.*;

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
        String[] aracBilgi;
        String hgsNo="";
        System.out.println("Bilgilerini öğrenmek istedeğiniz kullanıcının HGS No giriniz");
        String araHgsNo = scan.next();
        if (Otomobil.getAracSinifi().equalsIgnoreCase("Otomobil")) {
            Set<Map.Entry<String,String>> entrySet=Gise.toplamMap.entrySet();
            for (Map.Entry<String,String> each :entrySet) {
                hgsNo=each.getKey();
                aracBilgi=each.getValue().split(", ");
                if (araHgsNo.equals(hgsNo)) {
                    int bakiye=Integer.parseInt(aracBilgi[3])-200;
                    System.out.println("HGS No : "+hgsNo+"\n"+"İsim : "+aracBilgi[0]+"\n"+"Soyisim : "+aracBilgi[1]+"\n"+"Araç Türü : "+aracBilgi[2]+"\n"+"Kalan Bakiye : "+bakiye);
                }
            }
        } else if (Minibus.getAracSinifi().equalsIgnoreCase("Minibüs")) {
            Set<Map.Entry<String,String>> entrySet=Gise.toplamMap.entrySet();
            for (Map.Entry<String,String> each :entrySet) {
                hgsNo=each.getKey();
                aracBilgi=each.getValue().split(", ");
                if (araHgsNo.equals(hgsNo)) {
                    int bakiye=Integer.parseInt(aracBilgi[3])-250;
                    System.out.println("HGS No : "+hgsNo+"\n"+"İsim : "+aracBilgi[0]+"\n"+"Soyisim : "+aracBilgi[1]+"\n"+"Araç Türü : "+aracBilgi[2]+"\n"+"Kalan Bakiye : "+bakiye);                }
            }
        } else if (Otobus.getAracSinifi().equalsIgnoreCase("Otobüs")) {
            Set<Map.Entry<String,String>> entrySet=Gise.toplamMap.entrySet();
            for (Map.Entry<String,String> each :entrySet) {
                hgsNo=each.getKey();
                aracBilgi=each.getValue().split(", ");
                if (araHgsNo.equals(hgsNo)) {
                    int bakiye=Integer.parseInt(aracBilgi[3])-300;
                    System.out.println("HGS No : "+hgsNo+"\n"+"İsim : "+aracBilgi[0]+"\n"+"Soyisim : "+aracBilgi[1]+"\n"+
                            "Araç Türü : "+aracBilgi[2]+"\n"+"Kalan Bakiye : "+bakiye);                }
            }
        }
    }
}