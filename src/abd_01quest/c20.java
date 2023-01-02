package abd_01quest;

import java.util.Scanner;

public class c20
{
  /*Soru 20-)
Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır. Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ; aynı karakterlere sahip degilse
 "String benzersiz karakterlere sahip"
yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.

                Örnek:
                giriş: ama
		çıkış: Dizede yinelenen karakterler var

                İpucu: İf Else ve Char kullanarak çözebiliriz.*/


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String isim = scan.nextLine();
        int ısımADET= isim.length();


        if (ısımADET==3)
        {
            if (isim.substring(0,1).equals(isim.substring(1,2) )||isim.substring(0,1).equals(isim.substring(2,3))
            ||isim.substring(2,3).equals(isim.substring(1,2)) )
            {
                System.out.println("Dizede yinelenen karakterler var");
            }else
            {
                System.out.println("String benzersiz karakterlere sahip");
            }


        }else

        {
            System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        }

    }




}
