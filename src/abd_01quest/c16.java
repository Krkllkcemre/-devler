package abd_01quest;

import java.util.Scanner;

public class c16 {
    public static void main(String[] args) {
       /* Soru 16-)  Kullanıcıdan en az 5 harfli bir kelime alın. Alınan kelimenin son 3 harfinin
        2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
        Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
        Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
                Loopun içerisinde StringM methodlarından  yararlanalım!*/

     /*   Scanner scan =new Scanner(System.in);




        while (true){

            System.out.println("Lütfen en az 5 karakterli kelime girin");
          String kelime= scan.nextLine();
          int kAdeti = kelime.length();
          if (kAdeti>=5){
              String sonUC= kelime.substring(kAdeti-3,kAdeti);
              System.out.println(sonUC);
              System.out.println(sonUC);
          }else {

          }
        }*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 harfli bir kelime girin");
        String kelime = scan.nextLine();

        if (kelime.length()==5) {
            System.out.println(kelime.substring(kelime.length() - 3, kelime.length()) + "\n" +
                    kelime.substring(kelime.length() - 3, kelime.length()));
        }else
        {
            System.out.println("Geçersiz");
        }
    }
}
