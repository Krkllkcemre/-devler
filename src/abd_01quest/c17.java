package abd_01quest;

import java.util.Scanner;

public class c17 {
    public static void main(String[] args) {
      /*  Soru 17-)
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.

        Örnek:
        char ch1=            'a'
        String name =     "Ali bakkala geç gitti."
        Beklenen Çıktı=    a sayısı = 3
        Ipucu:
        Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz! Sayac adlı bir int variable oluşturarak
        bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!

                */

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir isim/kelime girin");
        String ad1 = scan.nextLine();
        char karakter= scan.next().charAt(0);

        int adKarakter= ad1.length();
        int sayac= 0;
        int toplamHarf = 0;


        while (true){

            char harf =ad1.charAt(sayac);

            if (karakter==harf){
                toplamHarf=toplamHarf+1;
            }

            sayac=sayac+1;
            if (sayac>=adKarakter){
                break;
            }

        }System.out.println(toplamHarf);*/



        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cümle giriniz");
        String cümle = scan.nextLine();
        System.out.println("Lütfen harf giriniz");
        char harf = scan.next().charAt(0);

        int sayaç=0;




        for (char i = 0; i < cümle.length(); i++)
        {
            char kelime = cümle.charAt(i);
            if (kelime==harf)
            {
                sayaç++;
            }


        }
       System.out.println(harf + " cümlede "  +  sayaç);

    }
}
