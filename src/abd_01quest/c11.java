package abd_01quest;

import java.util.Scanner;

public class c11 {
    public static void main(String[] args) {
        /*Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                Ad ve soyadın baş harfleri büyük olmalıdır
        Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
                Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
        Giriş :
		 > Gandalf Grey 563245879632
        Çıktı :
		 > İsim : G****** G***
		 > CCN : **** **** 9632*/
      /*  Scanner scan =new Scanner(System.in);
        System.out.println("Adınızı  giriniz ? ");
        String str1 = scan.nextLine();
        System.out.println("Soyadınızı giriniz ? ");
        String str = scan.nextLine();
        System.out.println("iban giriniz.");
        String iban= scan.nextLine();

        String ilkHarf = str1.substring(0, 1).toUpperCase();
        String soyIlkHarf= str.substring(0,1).toUpperCase();

        int isimAdet = str1.length();
        int soyAdet = str.length();

        System.out.print("İsim = " +ilkHarf);

        for (int i = 0; i < isimAdet-1; i++) {
            System.out.print("*");
        }System.out.println("");
        System.out.print("Soyisim= " +soyIlkHarf);

            for (int j = 0; j < soyAdet-1; j++) {
                System.out.print("*");

            }
            if (!(iban.length()==16)){
                System.out.println("Geçersiz kredi kartı numarası");
                
            }
            else{
                System.out.println("");
                for (int i = 0; i <11; i++) {
                    System.out.print("*");

          }

              String yazılcakSayı =iban.substring(11,15);
                System.out.print(yazılcakSayı);

            }
        System.out.print("*");*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyad= scan.nextLine();
        System.out.println("Lütfen Kart No giriniz");
        int kartNo = scan.nextInt();

        /*
        Giriş :
		 > Gandalf Grey 563245879632
        Çıktı :
		 > İsim : G****** G***
		 > CCN : **** **** 9632*/

        String basHar= isim.substring(0,1).toUpperCase();
        String soyadBasHar= soyad.substring(0,1).toUpperCase();

        int isimADET=isim.length();
        int soyadADET= soyad.length();







    }}
