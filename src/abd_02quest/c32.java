package abd_02quest;

import java.util.Arrays;
import java.util.Scanner;

public class c32 {
    /*
    Soru 32-)
Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir
Integer Array dizesini Reverse olarak (tersten) yazdırınız.
İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin...
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kaç deger gireceginizi  giriniz.");
        int girilenAlan = scanner.nextInt();
        int[] girilenDegerler = new  int[girilenAlan];
        System.out.println("Lütfen gireceginiz degerleri giriniz");



        for (int i = 0; i < girilenDegerler.length; i++) {
            int eleman=scanner.nextInt();
            girilenDegerler[(girilenAlan-i)-1]=eleman;
        }
        System.out.println(Arrays.toString(girilenDegerler));



    }





 }
