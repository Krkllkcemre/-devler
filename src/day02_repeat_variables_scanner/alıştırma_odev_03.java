package day02_repeat_variables_scanner;

import java.util.Scanner;

public class alıştırma_odev_03 {
    public static void main(String[] args) {
        /*
        Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        1 şeker = 1.5 gr
        1 kg = 1000 gram      olarak hesaplayınç*/


        Scanner scan = new Scanner(System.in);
        System.out.println("Günlük çay içme miktar gram cinsinden giriniz.");
        double cayMıktarı = scan.nextDouble();
        System.out.println("Günlük kullanılan şeker miktarı gram cinsinden  giriniz.");
        double sekerMiktarı = scan.nextDouble();

        System.out.println("Yıllık çay kullanımınız= " + 365 * cayMıktarı + " Gram");

        System.out.println("Yıllık şeker kullanımınız= " + 365 * sekerMiktarı + " Gram");

        /*   Soru 7-)  Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi
        tam sayiya cevirerek konsolda yazdirin.
        (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde
         bir sayiya döndürün
        ipuclari:
        Data Casting konusuna bakiniz. Auto Widening ve Explicit Narrowing konularini hatirlayali*/


        double sayı = 45.5;
        int sayı2 = (int) sayı;

        System.out.println(sayı2);

        float flt = 145;

        byte sayı3 = (byte) flt;

        System.out.println(sayı3);
       /*
        Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
        Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        ipuclari:
        Matematiksel Islemler konusuna bakalim.
        Bölme islemi kullanarak sayinin basamaklarini alalim ve toplam adli
        bir konteynira (Variable) atalim
*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üç basamaklı bir sayı giriniz");

        int sAYI = scanner.nextInt();
        int birlerBas = 0;
        int rakamlarınTP = 0;


        birlerBas = sAYI % 10;
        rakamlarınTP = birlerBas + rakamlarınTP;

        sAYI = sAYI / 10;
        birlerBas = sAYI % 10;
        rakamlarınTP = birlerBas + rakamlarınTP;

        sAYI = sAYI / 10;
        birlerBas = sAYI % 10;
        rakamlarınTP = birlerBas + rakamlarınTP;
        System.out.println("Girilen sayının rakamların toplamı= " + rakamlarınTP);



















    }
}
