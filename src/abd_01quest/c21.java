package abd_01quest;

import java.util.Scanner;

public class c21 {
    /*Soru 21-)
Bir aydaki gün sayısını bulmak için bir Java programı yazın
(Mülakat Sorusu / Interview Sorusu / Leak Year)

Örnek:
Bir ay numarası girin: 2
Bir yıl girin: 2016

Şubat 2016'da 29 gün vardır
ipucu:
Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir. Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!
ipucu2:
ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.

     */

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ay ve yıl girin");
        int ay = scan.nextInt();
        int yıl = scan.nextInt();
        int aydakiGün=0;


        switch (ay)
        {case 1 :
            aydakiGün=31;
            break;

            case 2:
                if (yıl%4==0 || yıl%100==0 ||yıl%400==0)
                {
                    aydakiGün =29;
                }else
                {
                    aydakiGün = 28;
                }
                break;
            case 3:
                aydakiGün=31;
                break;

            case 4:
                aydakiGün=30;
                break;
            case 5:
                aydakiGün=31;
                break;
            case 6:
                aydakiGün=30;
                break;
            case 7:
                aydakiGün=31;
                break;
            case 8:
                aydakiGün=30;
                break;
            case 9:
                aydakiGün=31;
                break;
            case 10:
                aydakiGün=30;
                break;
            case 11:
                aydakiGün=31;
                break;
            case 12:
                aydakiGün=30;
                break;


        }
        System.out.println(yıl + " yıllının " + ay + " ayının " + aydakiGün + " gün vardır.");




    }
}
