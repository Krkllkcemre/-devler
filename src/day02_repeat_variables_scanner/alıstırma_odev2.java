package day02_repeat_variables_scanner;

import java.util.Scanner;

public class alıstırma_odev2 {
    public static void main(String[] args) {
        System.out.println("\t\t*********\tSoru 3\t*********\n");
        /*Soru 3-)   SCANNER
     Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
     Ipuclari:
      * Sayilarin ortalamasi: toplam/5        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 5 adet sayı giriniz.");
        int sayı1= scan.nextInt();
        int sayı2= scan.nextInt();
        int sayı3= scan.nextInt();
        int sayı4= scan.nextInt();
        int sayı5= scan.nextInt();
        System.out.println("Girilen sayıların ortalamsı= " +(sayı1+sayı2+sayı3+sayı4+sayı5)/2);
        System.out.println("\t\t*********\tSoru 4\t*********\n");
        /*Soru 4-)   SCANNER
       Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.*/

        Scanner scann=new Scanner(System.in);
        System.out.println("Lütfen 1 sayı giriniz.");
        int sayı= scan.nextInt();
        System.out.println("Girilen sayının küpünün yarısı " + (sayı*sayı*sayı)/2);

        /* Soru 5-)   SCANNER
        Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan
        kodu yazın.
                Ipuclari:
        Google yaparak karenin alaninin ve cevresinin nasil bulundugunu ögrenin :-)*/
        System.out.println("\t\t*********\tSoru 5\t*********\n");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen karenin bir kenarını giriniz.");
        double karek= scan.nextDouble();
        System.out.println("Karenin alanı= " + karek*karek);
        System.out.println("Karenin çevresi= " +karek*4);
    }
}
