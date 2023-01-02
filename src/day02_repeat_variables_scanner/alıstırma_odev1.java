package day02_repeat_variables_scanner;

import java.util.Scanner;

public class alıstırma_odev1 {
    public static void main(String[] args) {
        System.out.println("\t\t*********\tSoru 1\t*********\n");
        /*
        Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
Ipuclari:   * r=7;  * Pi=3.14   * Dairenin Cevresi : 2*Pi*r    * Dairenin Alani : Pi*r*r  (edited)
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen Dairenin Yarı Çapı girin.");
        int r= scanner.nextInt();
        double pi=3.14;

        System.out.println("Dairenin çevresi " + 2*pi*r);
        System.out.println("Dairenin Alanı " + pi*r*r);
        System.out.println("\t\t*********\tSoru 2\t*********\n");
        /*    Soru-2)   SOUT/SYSO
       Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
               Ipuclari:
      * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
      * Dikdortgenin Alani : uzun kenar * kisa kenar    */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen uzun kenarı girin.");
        int uKenar= scanner.nextInt();
        System.out.println("Lütfen kısa kenarı girin.");
        int kKenar= scanner.nextInt();

        System.out.println( "Dikdortgenin Cevresi ="+ 2 * (uKenar + kKenar));
        System.out.println( "Dikdortgenin Alanı ="+ uKenar * kKenar);


    }
}
