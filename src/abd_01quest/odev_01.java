package abd_01quest;

import java.util.Random;
import java.util.Scanner;

public class odev_01 {
    public static void main(String[] args) {
        /*
    random olarak 1 ile 100 arasinda bir sayi olusturun
    kullanicidan bu sayiyi bilmesini isteyin
    kullanici her deger girdiginde
    tuttugumuz sayi ile karsilastirip tahminini buyult/kucult diyelim
    kullanici tuttugumuz sayiyi bildiginde
    tahmin sayisini ve

    - 3 veya daha az tahminde bildiyse "Vaowww"
    - 4-8 tahminde bildiyse "Aferin"
    - daha fazla tahminde bildiyse "basarisiz"
    yazdirin
 */

        Random rasgele=new Random();
        int sayı = rasgele.nextInt(100);
        System.out.println(sayı);
        Scanner scan =new Scanner(System.in);
        System.out.println("Tahmininiz??");
        int tahminsayısı=0;


        while (true){
            tahminsayısı++;

            int tahmin= scan.nextInt();

            if (tahmin==sayı){

                if (tahminsayısı<=3){

                    System.out.println("vaowww");
                } else if (tahminsayısı>=4 && tahminsayısı<=8) {
                    System.out.println("Aferin");

                }else {
                    System.out.println("Başarısız");
                }
             break;
            }else {
                System.out.println("olmadı bee");

            }
        }
    }
}
