package abd_01quest;

import java.util.Scanner;

public class c14 {
    public static void main(String[] args) {
       /* Soru 14-)
        Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır. Ardından ismin aynı karakterlere sahip
        olup olmadığını kontrol edelim.
                İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
                 değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
                Ipucu:
        IF/Else veya Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.*/



      /* Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen isim giriniz.Bu isim 3 harfli olmalıdır.");
        String isim =scan.nextLine();
        int isimAdet = isim.length();

        if (!(isimAdet==3)){
            System.out.println("Geçersiz yeniden girin");
        }else {
            String iHarf=isim.substring(0,1);
           String ikiHarf= isim.substring(1,2);
           String ucHar= isim.substring(2,3);
           if (iHarf.equals(ikiHarf)||ikiHarf.equals(ucHar)||iHarf.equals(ucHar)){
               System.out.println("Dize yinelenen karakterlere sahip");
           }else {
               System.out.println("Dize benzersiz karakterlere sahip");
           }*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isim giriniz");
        String isim = scan.nextLine();

        if ((!(isim.length()==3)))
        {
            System.out.println("Fazla veya eksik girdiniz");
        } else if (isim.substring(0,1).equals(isim.substring(1,2))
                ||isim.substring(0,1).equals(isim.substring(2,3))
                || isim.substring(1,2).equals(isim.substring(2,3)))
        {
            System.out.println("Dize yinelenen karakterlere sahip");
        }else
        {
            System.out.println("Dize benzersiz karakterlere sahip");

        }


    }


 }

