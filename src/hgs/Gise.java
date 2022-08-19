package hgs;

public class Gise {
    static int toplamBakiye;
    static int toplamArac;

    public static void toplamBakiye() {
        if (Kullanici.kullaniciBilgi[2].equalsIgnoreCase("Otomobil")) {
            toplamBakiye+=200;
        } else if (Kullanici.kullaniciBilgi[2].equalsIgnoreCase("Minibüs")) {
            toplamBakiye+=250;
        } else if (Kullanici.kullaniciBilgi[2].equalsIgnoreCase("Otobüs")) {
            toplamBakiye+=300;
        }
    }
    public static void kullaniciBakiye() {
        if (Kullanici.kullaniciBilgi[2].equalsIgnoreCase("Otomobil")) {
            Kullanici.bakiye-=200;
        } else if (Kullanici.kullaniciBilgi[2].equalsIgnoreCase("Minibüs")) {
            Kullanici.bakiye-=250;
        } else if (Kullanici.kullaniciBilgi[2].equalsIgnoreCase("Otobüs")) {
            Kullanici.bakiye-=300;
        }
        System.out.println(Kullanici.bakiye);
    }

    public static void gecenArac() {
        if (Kullanici.kullaniciBilgi[2].equalsIgnoreCase("Otomobil")) {
            toplamArac++;
        } else if (Kullanici.kullaniciBilgi[2].equalsIgnoreCase("Minibüs")) {
            toplamArac++;
        } else if (Kullanici.kullaniciBilgi[2].equalsIgnoreCase("Otobüs")) {
            toplamArac++;
        }
    }
}
