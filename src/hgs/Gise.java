package hgs;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gise {
    static List<Object> toplamList = new ArrayList<>();

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
                otomobilEkleme();
                gise();
                break;
            case "2":
                minibusEkleme();
                gise();
                break;
            case "3":
                otobusEkleme();
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
    /*protected static void ekleme() {
        if (aracTuru.equalsIgnoreCase("Otomobil")){
            System.out.println("İsim");
            scan.nextLine();
            String isim=scan.nextLine();
            System.out.println("Soyisim");
            String soyIsim = scan.nextLine();
            System.out.println("Araç Sınıfı");
            String aracSinifi = scan.next();
            System.out.println("HGS No");
            String hgsNo = scan.next();
            System.out.println("Bakiye");
            int bakiye = scan.nextInt();
            Otomobil otomobil = new Otomobil(isim, soyIsim, aracSinifi, hgsNo, bakiye);
            //otomobilList.add(otomobil);
            //toplamList.addAll(otomobilList);
            toplamList.add(otomobil);
            System.out.println(toplamList);
        } else if (aracTuru.equalsIgnoreCase("Minibüs")) {
            System.out.println("İsim");
            scan.nextLine();
            String isim=scan.nextLine();
            System.out.println("Soyisim");
            String soyIsim = scan.nextLine();
            System.out.println("Araç Sınıfı");
            String aracSinifi = scan.next();
            System.out.println("HGS No");
            String hgsNo = scan.next();
            System.out.println("Bakiye");
            int bakiye = scan.nextInt();
            Minibus minibus = new Minibus(isim, soyIsim, aracSinifi, hgsNo, bakiye);
            //minibusList.add(minibus);
            //toplamList.addAll(minibusList);
            toplamList.add(minibus);
            System.out.println(toplamList);
        }else {
            System.out.println("İsim");
            scan.nextLine();
            String isim=scan.nextLine();
            System.out.println("Soyisim");
            String soyIsim = scan.nextLine();
            System.out.println("Araç Sınıfı");
            String aracSinifi = scan.next();
            System.out.println("HGS No");
            String hgsNo = scan.next();
            System.out.println("Bakiye");
            int bakiye = scan.nextInt();
            Otobus otobus = new Otobus(isim, soyIsim, aracSinifi, hgsNo, bakiye);
            //otobusList.add(otobus);
            //toplamList.addAll(otobusList);
            toplamList.add(otobus);
            System.out.println(toplamList);
        }
    }*/
    protected static void otobusEkleme() {
        System.out.println("İsim");
        scan.nextLine();
        String isim=scan.nextLine();
        System.out.println("Soyisim");
        String soyIsim = scan.nextLine();
        System.out.println("Araç Sınıfı");
        String aracSinifi = scan.next();
        System.out.println("HGS No");
        String hgsNo = scan.next();
        System.out.println("Bakiye");
        int bakiye = scan.nextInt();
        Otobus otobus = new Otobus(isim, soyIsim, aracSinifi, hgsNo, bakiye);
        toplamList.add(otobus);
        System.out.println(toplamList);
    }

    protected static void minibusEkleme() {
        System.out.println("İsim");
        scan.nextLine();
        String isim=scan.nextLine();
        System.out.println("Soyisim");
        String soyIsim = scan.nextLine();
        System.out.println("Araç Sınıfı");
        String aracSinifi = scan.next();
        System.out.println("HGS No");
        String hgsNo = scan.next();
        System.out.println("Bakiye");
        int bakiye = scan.nextInt();
        Minibus minibus = new Minibus(isim, soyIsim, aracSinifi, hgsNo, bakiye);
        toplamList.add(minibus);
        System.out.println(toplamList);
    }

    protected static void otomobilEkleme() {
        System.out.println("İsim");
        scan.nextLine();
        String isim=scan.nextLine();
        System.out.println("Soyisim");
        String soyIsim = scan.nextLine();
        System.out.println("Araç Sınıfı");
        String aracSinifi = scan.next();
        System.out.println("HGS No");
        String hgsNo = scan.next();
        System.out.println("Bakiye");
        int bakiye = scan.nextInt();
        Otomobil otomobil = new Otomobil(isim, soyIsim, aracSinifi, hgsNo, bakiye);
        toplamList.add(otomobil);
        System.out.println(toplamList);
    }

}
