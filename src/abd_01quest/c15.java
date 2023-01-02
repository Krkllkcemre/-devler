package abd_01quest;

import java.util.Scanner;

public class c15 {
    public static void main(String[] args) {

    /*Soru 15-)
  Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
-> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
-> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
    Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
    Örn:
    isim1= masa
            isim2= ali
    Konsol => maalisa*/

      /*  Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir isim/kelime girin");
        String ad1 = scan.nextLine();
        System.out.println("Lütfen ikinci isim/kelime girin");
        String ad2 = scan.nextLine();
        int isim =ad1.length();
        int isimYarısı =isim/2;
        String strad=ad1.substring(0,isimYarısı) ;
        String strad2=ad1.substring(isimYarısı,isim);

        if (isim%2==0){
            System.out.println(strad+ad2+strad2);

        }else {
            System.out.println("İsim 2, isim 1'e eklenemez. ");
        }*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen birisim giriniz");
        String isim1= scan.nextLine();
        System.out.println("Lütfen birisim daha giriniz");
        String isim2= scan.nextLine();

   String ilkYarı =isim1.substring(0,isim1.length()/2);
   String ikinciYarı=isim1.substring(isim1.length()/2,isim1.length());


        if (isim1.length()%2==0)
        {
            System.out.println(ilkYarı+isim2+ikinciYarı);
        }
        else
        {
            System.out.println("isim2, isim1'e eklenemez");
        }
    }
}