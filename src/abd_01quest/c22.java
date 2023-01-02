package abd_01quest;

import java.util.Scanner;

public class c22
{
    /*Soru 22-)
Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
Giriş :
30 ve 40

Beklenen Çıktı:
30 ve 40 için EBOB= 10
30 ve 40 için EKOK= 120
ipucu:
Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.


     */

    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int say1= scan.nextInt();
        System.out.println("Lütfen bir sayı daha giriniz.");
        int say2= scan.nextInt();
        int ebob=1;
        int ekok=1;
        int kSayi=1;



        if (say1<say2)
        {
            kSayi=say1;
        }else
        {
            kSayi=say2;
        }
        for (int i = 2; i <=kSayi ; i++)
        {
            if (say1%i==0 && say2%i==0)
            {
                ebob=i;
            }

        }
        ekok= (say1*say2)/ebob;
        System.out.println("En büyük ortak bölen = " + ebob +
                " En küçük ortak kat " + ekok);










    }

}

