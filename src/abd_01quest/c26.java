package abd_01quest;

import java.util.Scanner;

public class c26
{
    /*Soru 26-)
Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
Örnek:
Giriş :6
Çıkış: 6 Mükemmel Sayıdır
Giriş :7
Çıkış:7 Mükemmel Sayı Değildir
ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz

     */

    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayı= scanner.nextInt();
        int toplam =0;


        for (int i = 2; i <sayı ; i+=2)
        {
           toplam+=i;

        } if (toplam==sayı)
        {
            System.out.println(sayı + " Mükemmel Sayıdır");
        }else
        {
            System.out.println(sayı + " Mükemmel Sayı Değildir");
        }








    }


}
