package abd_02quest;

import java.util.Scanner;

public class c34 {
   /* Soru 34-)
    Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.

    Örnek
    String str : ade1r4d3
    Int toplam : 8
    İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
    Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz

    */
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Lütfen metin girin.");
       String metin = scan.nextLine();
       int toplam = 0;

       String metinArr[]=metin.split("");
       for (int i = 0 ; i < metinArr.length; i ++)
       {
           if (Character.isDigit(metinArr[i].charAt(0)))
           {
               toplam+=Integer.valueOf(metinArr[i]);
           }

       }
       System.out.println(toplam);

   }
}
