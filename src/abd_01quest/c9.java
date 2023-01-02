package abd_01quest;

import java.util.Scanner;

public class c9 {
    public static void main(String[] args) {
       /* Soru 9-)  Girilen zamanı saniyeye çeviriniz.
        Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
        Ipucu:
        Saati alıp saniyeye cevirebilirsiniz.  Kullanıcıdan
        ayrı ayrı alabilirsiniz veya  kullanıcıdan hepsini birlikte alabilirsiniz.*/


     /*   Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen zamanı 'saat, dakika,saniye' cinsinden sıralı şekilde giriniz.");

        int saat =scan.nextInt();
        int dakika= scan.nextInt();
        int saniye=scan.nextInt();

        int toplam = (saat*60*60)+(dakika*60)+saniye;
        System.out.println("Girdiginiz zaman "+toplam+" saniyedir.");*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen saat giriniz");
        int saat = scanner.nextInt();
        System.out.println("Lütfen dakkika giriniz");
        int dk= scanner.nextInt();
        System.out.println("Lütfen saniye giriniz");
        int saniye= scanner.nextInt();


        int saatSANİYE = saat*(60*60);
        int dkSaniye=dk*60;

        System.out.println(saatSANİYE+dkSaniye+saniye);

        }
}
