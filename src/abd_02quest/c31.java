package abd_02quest;

import java.util.Arrays;
import java.util.Scanner;

public class c31
{
    /*
    Soru 31-)
Kullanıcıdan Arrayin uzunlugunu isteyin.
Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
     */
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Array'in uzunlugunu giriniz");
        int girilenDeger = scan.nextInt();
        int []arrUzunluk = new int[girilenDeger];
        System.out.println("Lütfen Array'ın elemanlarını giriniz");
        for (int i = 0; i <arrUzunluk.length ; i++) {
            int girilenEleman= scan.nextInt();

            arrUzunluk[i]=girilenEleman;
        }
        System.out.println(Arrays.toString(arrUzunluk));

    }

}
