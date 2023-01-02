package abd_02quest;

import java.util.Scanner;

public class c28 {
    /*
    Soru-28)
Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
Örnek:
      Sayı: 1238
      Sayının Tersi: 8321
İpucu:  Loop kullanabilirsiniz.
     */

    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir sayıgiriniz");

        int girilenSayı= scan.nextInt();
        String strgirilenSay=String.valueOf(girilenSayı);
        String tersStr="";

        for (int i = strgirilenSay.length()-1; i >=0 ; i--) {

            tersStr+=strgirilenSay.substring(i,i+1);


        }
        System.out.println("Girilen sayının tersten yazılışı= " +tersStr);




    }
}
