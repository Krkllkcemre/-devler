package abd_01quest;


public class c23
{
    /*Soru 23-)
Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan
 bir method yazın. Method bize çıktıyı döndürsün.
Örnek:
Girdi: 6
Çıktı: 6!=65432*1=720
ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
 */
    public static void main(String[] args)
    {
        faktöryel(3);
    }
    public static void faktöryel (int sayı)
    {
        int faktöriyelSonuç= 1 ;
        for (int i = 1; i <sayı ; i++)
        {
            faktöriyelSonuç=sayı*faktöriyelSonuç;

        }
        System.out.println(faktöriyelSonuç);

    }





}
