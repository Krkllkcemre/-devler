package abd_01quest;

import java.util.Scanner;

public class c12 {
    public static void main(String[] args) {
       /* Soru 12-)
        Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir-
                hesaplamak ve yazdırmak için bir program oluşturalım


        Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

        Ipucu:  IF/Else kullanabilirsiniz.
                Örnek:
        İki tamsayı girin:
        25  veya  4567986321453
        46   veya 123456
        Konsolda Çıktı :
        Sayıların toplamı: 71  veya  Fazla Yüklenme*/


     /*   Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen iki tane tam sayı giriniz.");
       double sayı1= scan.nextDouble();
      double sayı2= scan.nextDouble();
       double toplamı=sayı1+sayı2;

        String sayi1str=""+ sayı1;
        String sayi2str=""+ sayı2;
        String toplamstr=""+ toplamı;



        if (10<sayi1str.length()) {
            System.out.println("Fazla yükleme yaptınız");
        } else if (10<sayi2str.length()) {
            System.out.println("Fazla yükleme yaptınız");
        } else if (10<toplamstr.length()) {

        System.out.println("Fazla yükleme yaptınız");

        }else {
            System.out.println("İki sayının toplamı " + toplamı);
        }*/


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki adet sayı girin");
        double say1 = scan.nextDouble();
        double sayı2= scan.nextDouble();
        double toplam = say1+sayı2;

        String strToplam =String.valueOf(toplam);

        if (10<=strToplam.length())
        {
            System.out.println("Aşırı yükleme yaptınız");
        }else {
            System.out.println(strToplam);
        }



    }
}
