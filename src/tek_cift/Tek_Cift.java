package tek_cift;

public class Tek_Cift {
    /*
    Bir sayının Tek mi Çift mi olduğunu belirleyen bir
    işlev oluşturun. Bir sayı, tüm basamaklarının toplamı
    tek ise tek, tüm basamaklarının toplamı çift ise çift
    bir sayıdır. Bir sayı tek ise, "Odd" döndürün. Aksi
    takdirde, "Even" değerini döndürün. Örnek olarak:
    oddishOrEvenish(43) ➞ "Odd"
    // 4 + 3 = 7
    // 7 % 2 = 1

    oddishOrEvenish(373) ➞ "Odd"
    // 3 + 7 + 3 = 13
    // 13 % 2 = 1

    oddishOrEvenish(4433) ➞ "Even"
    // 4 + 4 + 3 + 3 = 14
   // 14 % 2 = 0
     */
    public static void main(String[] args) {
        int sayi=4433;
        int toplam=0;
        while (sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }
       if (toplam%2!=0){
           System.out.println("Odd");
       }else {
           System.out.println("Even");
       }
    }
}
