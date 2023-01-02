package abd_01quest;

import java.util.Scanner;

public class c13 {
    public static void main(String[] args) {


   /* Soru 13-)
    Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
    Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
    Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
    Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
    Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
    Ipucu:
    Switch konusunu hatırlayalım!*/
      /*  Scanner scan =new Scanner(System.in);
        char ilkHarf =scan.next().charAt(0);

        switch (ilkHarf){
            case 'a':
            System.out.println("İsteğiniz işleniyor");
            break;

            case 'b':
                System.out.println("Değerlendirmeniz için yine de teşekkür ederiz");
                break;

            case 'c':
                    System.out.println("Üzgünüm şuanda yardımcı olamıyoruz");
                    break;
            default:
                System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");

        }*/

        Scanner scan = new Scanner(System.in);
        char harf = scan.next().charAt(0);

        switch (harf)
        {
            case'a':
                System.out.println("İsteğiniz işleniyor");
                break;
            case 'b':
                System.out.println("Değerlendirmeniz için yine de teşekkür ederiz");
                break;
            case 'c':
                System.out.println("Üzgünüm şuanda yardımcı olamıyoruz");
                break;
            default:
                System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");

        }





    }
}