package abd_01quest;

import java.util.Scanner;

public class C10 {
    public static void main(String[] args) {
          /* Soru 10-)  Klasik Soru :slightly_smiling_face:
        Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın

                **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) //
                 If konusunu hatırlayın!***
                Kullanıcıya aşağıdaki gibi mesaj verin:

        Eğer VKİ 18.5'ten az ise --> zayıfsınız
        Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
        Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
        VKİ 30'a eşit veya daha fazlaysa --> obez

        ÖRNEK :

        Ağırlık : 71
        Yükseklik : 1,72

        ÇIKTI :

        VKİ değeriniz : 23.99945916711736 Kilonuz ideal (edited)*/

      /*  Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen kilonuzu girin.");
        double kilo = scan.nextDouble();
        System.out.println("lütfen boyunuzu girin");
        double boy = scan.nextDouble();

        double vki =(kilo*10000)/(boy*boy);


         if (vki<= 18.5 ){
             System.out.println("Vücut kitle indeksiniz= " + vki + " Zayıfsınız.");
         }
         else if (18.5<vki && vki<=25) {
             System.out.println("Vücut kitle indeksiniz= " + vki + " İdeal.");
         }
         else if (25<vki && vki<=30) {
             System.out.println("Vücut kitle indeksiniz= " + vki + " Şişmansınız.");
         }
         else if (30<= vki) {
             System.out.println("Vücut kitle indeksiniz= " + vki + " Obez.");
         }

         else {
             System.out.println("Girdiginiz degerler hatalı");
         }*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen boy girin");
        double boy = scan.nextDouble();
        System.out.println("Lütfen kilo girin");
        double kilo = scan.nextDouble();

        double vki=kilo*10000/(boy*boy);


        if (vki<=18.5 )
        {
            System.out.println("Zayıfsınız");
        } else if (vki>18.5 && vki<=25)
        {
            System.out.println("İdeal");
        } else if (vki>25 && vki<=30)
        {
            System.out.println("Şişmansınız");

        } else if (vki>30)
        {
            System.out.println("Obezsiniz");
        }
        else {
            System.out.println("Hatalı giriş");
        }


    }
}
