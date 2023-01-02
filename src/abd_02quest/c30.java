package abd_02quest;

import java.util.Scanner;

public class c30 {
    /*
    Soru 30-)
Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
( mülakat sorusu )
Örnek:
String str="Javacokkolay"
Yinelenen karakterler : [a, o, k]
İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
            Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıpkonteynıra atacaksınız
             bu yüzden iç içe loop kullanmak mantıklı duruyor

     */

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cümle giriniz");
        String girilenCümle= scan.next();
        String kullanilacakCümle=girilenCümle.toLowerCase();
        String tkrHarf="";


        for (int i = 0; i <kullanilacakCümle.length() ; i++)
        {
            for (int j = 1; j <kullanilacakCümle.length() ; j++)
            {
                if (kullanilacakCümle.substring(i,i+1).equalsIgnoreCase(kullanilacakCümle.substring(j,j+1)))
                   if (!tkrHarf.contains(kullanilacakCümle.substring(j, j + 1)))
                   {
                       tkrHarf+=kullanilacakCümle.substring(j, j + 1);
                   }

            }

        }
        System.out.println(tkrHarf);


    }
}
