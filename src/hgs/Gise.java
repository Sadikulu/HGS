package hgs;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Gise extends Kullanici{
    static Map<String,String> toplamMap = new HashMap<>();
    static String aracTuru;

    static Scanner scan = new Scanner(System.in);
    public static void gise(){
        System.out.println("    ===========HGS===========\n" +
                "=====Gişe Otomasyon Sistemi=====\n" +
                "\t   1- Otomobil\n" +
                "\t   2- Minibüs\n" +
                "\t   3- Otobüs\n" +
                "\t   Q-Çıkış");
        System.out.println("Lütfen seçminizi yapınız");
        String secim = scan.next();
        switch (secim) {
            case "1":
                //otomobilEkleme();
                aracTuru="Otomobil";
                ekleme();
                gise();
                break;
            case "2":
                //minibusEkleme();
                aracTuru="Minibüs";
                ekleme();
                gise();
                break;
            case "3":
                //otobusEkleme();
                aracTuru="Otobüs";
                ekleme();
                gise();
                break;
            case "q":
                break;
            case "Q":
                break;
            default:
                System.out.println("Geçerli bir değer giriniz");
                gise();
        }
    }
    protected static void ekleme() {
        if (aracTuru.equalsIgnoreCase("Otomobil")){
            System.out.println("İsim");
            scan.nextLine();
            String isim=scan.nextLine();
            System.out.println("Soyisim");
            String soyIsim = scan.nextLine();
            System.out.println("Araç Sınıfı");
            String aracSinifi = scan.next();
            gecenArac.add(aracSinifi);
            toplamBakiye+=200;
            System.out.println("HGS No");
            String hgsNo = scan.next();
            System.out.println("Bakiye");
            int bakiye = scan.nextInt();
            LocalDate tarih=LocalDate.now();
            LocalTime saat = LocalTime.now();
            Otomobil otomobil = new Otomobil(isim, soyIsim, aracSinifi, hgsNo, bakiye);
            String eklenenValue=isim+", "+soyIsim+", "+aracSinifi+", "+bakiye+", "+tarih+", "+saat;
            toplamMap.put(hgsNo,eklenenValue);
        } else if (aracTuru.equalsIgnoreCase("Minibüs")) {
            System.out.println("İsim");
            scan.nextLine();
            String isim=scan.nextLine();
            System.out.println("Soyisim");
            String soyIsim = scan.nextLine();
            System.out.println("Araç Sınıfı");
            String aracSinifi = scan.next();
            gecenArac.add(aracSinifi);
            toplamBakiye+=200;
            System.out.println("HGS No");
            String hgsNo = scan.next();
            System.out.println("Bakiye");
            int bakiye = scan.nextInt();
            LocalDate tarih=LocalDate.now();
            LocalTime saat = LocalTime.now();
            Minibus minibus = new Minibus(isim, soyIsim, aracSinifi, hgsNo, bakiye);
            String eklenenValue=isim+", "+soyIsim+", "+aracSinifi+", "+bakiye+", "+tarih+", "+saat;
            toplamMap.put(hgsNo,eklenenValue);
        }else {
            System.out.println("İsim");
            scan.nextLine();
            String isim=scan.nextLine();
            System.out.println("Soyisim");
            String soyIsim = scan.nextLine();
            System.out.println("Araç Sınıfı");
            String aracSinifi = scan.next();
            gecenArac.add(aracSinifi);
            toplamBakiye+=200;
            System.out.println("HGS No");
            String hgsNo = scan.next();
            System.out.println("Bakiye");
            int bakiye = scan.nextInt();
            LocalDate tarih=LocalDate.now();
            LocalTime saat = LocalTime.now();
            Otobus otobus = new Otobus(isim, soyIsim, aracSinifi, hgsNo, bakiye);
            String eklenenValue=isim+", "+soyIsim+", "+aracSinifi+", "+bakiye+", "+tarih+", "+saat;
            toplamMap.put(hgsNo,eklenenValue);
        }
        String[] aracBilgi;
        String hgsNo="";
        Set<Map.Entry<String,String>> entrySet=Gise.toplamMap.entrySet();
        for (Map.Entry<String,String> each :entrySet) {
            hgsNo=each.getKey();
            aracBilgi=each.getValue().split(", ");
                System.out.println("İsim : "+aracBilgi[0]+"\n"+"Soyisim : "+aracBilgi[1]+"\n"+
                        "Araç Türü : "+aracBilgi[2]+"\n"+"HGS No : "+hgsNo+"\n"+"Bakiye : "+aracBilgi[3]+"\n"+
                        "Tarih : "+aracBilgi[4]+"\n"+"Saat : "+aracBilgi[5]+"\n");
            }
    }
    /*protected static void otobusEkleme() {
        System.out.println("İsim");
        scan.nextLine();
        String isim=scan.nextLine();
        System.out.println("Soyisim");
        String soyIsim = scan.nextLine();
        System.out.println("Araç Sınıfı");
        String aracSinifi = scan.next();
        gecenArac.add(aracSinifi);
        toplamBakiye+=200;
        System.out.println("HGS No");
        String hgsNo = scan.next();
        System.out.println("Bakiye");
        int bakiye = scan.nextInt();
        LocalDate tarih=LocalDate.now();
        LocalTime saat = LocalTime.now();
        Otobus otobus = new Otobus(isim, soyIsim, aracSinifi, hgsNo, bakiye);
        String eklenenValue=isim+", "+soyIsim+", "+aracSinifi+", "+bakiye+", "+tarih+", "+saat;
        toplamMap.put(hgsNo,eklenenValue);
        }
        String[] aracBilgi;
        String hgsNo="";
        Set<Map.Entry<String,String>> entrySet=Gise.toplamMap.entrySet();
        for (Map.Entry<String,String> each :entrySet) {
            hgsNo=each.getKey();
            aracBilgi=each.getValue().split(", ");
                System.out.println("İsim : "+aracBilgi[0]+"\n"+"Soyisim : "+aracBilgi[1]+"\n"+
                        "Araç Türü : "+aracBilgi[2]+"\n"+"HGS No : "+hgsNo+"\n"+"Bakiye : "+aracBilgi[3]+"\n"+
                        "Tarih : "+aracBilgi[4]+"\n"+"Saat : "+aracBilgi[5]+"\n");
            }
    }*/

    /*protected static void minibusEkleme() {
        System.out.println("İsim");
        scan.nextLine();
        String isim=scan.nextLine();
        System.out.println("Soyisim");
        String soyIsim = scan.nextLine();
        System.out.println("Araç Sınıfı");
        String aracSinifi = scan.next();
        gecenArac.add(aracSinifi);
        toplamBakiye+=200;
        System.out.println("HGS No");
        String hgsNo = scan.next();
        System.out.println("Bakiye");
        int bakiye = scan.nextInt();
        LocalDate tarih=LocalDate.now();
        LocalTime saat = LocalTime.now();
        Minibus minibus = new Minibus(isim, soyIsim, aracSinifi, hgsNo, bakiye);
        String eklenenValue=isim+", "+soyIsim+", "+aracSinifi+", "+bakiye+", "+tarih+", "+saat;
        toplamMap.put(hgsNo,eklenenValue);
        }
        String[] aracBilgi;
        String hgsNo="";
        Set<Map.Entry<String,String>> entrySet=Gise.toplamMap.entrySet();
        for (Map.Entry<String,String> each :entrySet) {
            hgsNo=each.getKey();
            aracBilgi=each.getValue().split(", ");
                System.out.println("İsim : "+aracBilgi[0]+"\n"+"Soyisim : "+aracBilgi[1]+"\n"+
                        "Araç Türü : "+aracBilgi[2]+"\n"+"HGS No : "+hgsNo+"\n"+"Bakiye : "+aracBilgi[3]+"\n"+
                        "Tarih : "+aracBilgi[4]+"\n"+"Saat : "+aracBilgi[5]+"\n");
            }
    }*/

    /*protected static void otomobilEkleme() {
        System.out.println("İsim");
        scan.nextLine();
        String isim=scan.nextLine();
        System.out.println("Soyisim");
        String soyIsim = scan.nextLine();
        System.out.println("Araç Sınıfı");
        String aracSinifi = scan.next();
        gecenArac.add(aracSinifi);
        toplamBakiye+=200;
        System.out.println("HGS No");
        String hgsNo = scan.next();
        System.out.println("Bakiye");
        int bakiye = scan.nextInt();
        LocalDate tarih=LocalDate.now();
        LocalTime saat = LocalTime.now();
        Otomobil otomobil = new Otomobil(isim, soyIsim, aracSinifi, hgsNo, bakiye);
        String eklenenValue=isim+", "+soyIsim+", "+aracSinifi+", "+bakiye+", "+tarih+", "+saat;
        toplamMap.put(hgsNo,eklenenValue);
        }
        String[] aracBilgi;
        String hgsNo="";
        Set<Map.Entry<String,String>> entrySet=Gise.toplamMap.entrySet();
        for (Map.Entry<String,String> each :entrySet) {
            hgsNo=each.getKey();
            aracBilgi=each.getValue().split(", ");
                System.out.println("İsim : "+aracBilgi[0]+"\n"+"Soyisim : "+aracBilgi[1]+"\n"+
                        "Araç Türü : "+aracBilgi[2]+"\n"+"HGS No : "+hgsNo+"\n"+"Bakiye : "+aracBilgi[3]+"\n"+
                        "Tarih : "+aracBilgi[4]+"\n"+"Saat : "+aracBilgi[5]+"\n");
            }
    }*/

}
