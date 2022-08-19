package hgs;

import java.util.Scanner;

public class Ana_Menu {
    static Scanner scan = new Scanner(System.in);

    public static void baslangic() {
        System.out.println("    ===========HGS===========\n" +
                "=====Bilgi Otomasyon Sistemi=====\n" +
                "\t   1- Kullanıcı Girişi\n" +
                "\t   2- Yönetici Girişi\n"+
                "\t   Q-Çıkış");
        System.out.println("Lütfen seçminizi yapınız");
        String secim = scan.next();
        switch (secim) {
            case "1":
                Kullanici.kullanici();
                baslangic();
                break;
            case "2":
                Yonetim.yonetim();
                baslangic();
                break;
            case "q":
                break;
            case "Q":
                break;
            default:
                System.out.println("Geçerli bir değer giriniz");
                baslangic();

        }

    }

}
