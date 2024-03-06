import java.util.Scanner;

class Basamaktoplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        int sayi = input.nextInt();
        int BasamakSayisi;
        int toplam = 0;
        while (sayi !=0){
            BasamakSayisi = sayi % 10;
            toplam = toplam + BasamakSayisi;
            sayi = sayi /10;
        }
        System.out.println("Toplam= "+ toplam);

    }
}
