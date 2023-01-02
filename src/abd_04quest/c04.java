package abd_04quest;

import java.util.Scanner;

public class c04
{
    /*
    * Problem Tanımı :
  Basit 4 işlem yapan bir hesap makinesi kodlayınız.

  Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
  Kullanicidan iki sayi girmesini isteyiniz.
  Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
     */

    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("İşlem yapmak istediğiniz ilk sayıyı giriniz.");
        int sayı1=scanner.nextInt();
        System.out.println("Hesap makinesi için ; \nÇapma için '*'\nBölme için '/'\nToplama için '+'\nÇıkartma için '-'" +
                "\tkarakterini kullanın.!\nLütfen bir karakter giriniz");

        char karakter=scanner.next().charAt(0);
        System.out.println("İşlem yapmak istediğiniz ikinci sayıyı giriniz.");
        int sayı2=scanner.nextInt();


        switch (karakter)
        {
            case '+':
                System.out.println("Toplam sonucu=" + (sayı1+sayı2));
                break;
            case '-':
                System.out.println("Çıkartma sonucu=" + (sayı1-sayı2));
                break;
            case '*':
                System.out.println("Çarpım sonucu=" + (sayı1*sayı2));
                break;
            case '/':
                System.out.println("Bölme sonucu=" + (sayı1/sayı2));
                break;
        }



    }
}
