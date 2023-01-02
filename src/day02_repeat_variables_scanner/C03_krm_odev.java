package day02_repeat_variables_scanner;

import java.util.Scanner;

public class C03_krm_odev {
    public static void main(String[] args) {
         /*
         girilen iki sayını toplamını ekranda göster
          */

        Scanner scn= new Scanner(System.in);
        System.out.println("bir sayı giriniz");

          int girilenSayı=0;
          girilenSayı= scn.nextInt();

        System.out.println("bir sayı daha giriniz");
          int girilensayı2=0;
          girilensayı2= scn.nextInt();
          int tplsayı=girilenSayı+girilensayı2;

        System.out.println("girilen sayıların toplamı="+tplsayı);




    }
}
