package abd_02quest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c37 {
    /*
    Soru 37-)
--BONUS--  ---SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
(Eliminate duplicates)
ENG:
Write a method that returns a new array by eliminating
the duplicate values in the array using the following method header
Write a test program that reads in ten integers, invokes the method, and displays the result.
(Tekrarlananları çıkar)
TÜR:
Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
---->>>
public static int[] eliminateDuplicates(int[] list)
ÖRNEK:
On sayi giriniz:
1 2 3 2 1 6 3 4 5 2
ÇIKTI:
Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
     */
    public static void main(String[] args)
    {
       Integer[] sayılar={1,2,3,2,1,6,3,4,5,2};


       List<Integer>yeniSyılar= Arrays.asList(sayılar);


       System.out.println(eliminateDuolicates(yeniSyılar));

    }

    public static ArrayList<Integer> eliminateDuolicates(List<Integer> list)
    {
       ArrayList<Integer> eklenecekler = new ArrayList<>();

        for (Integer each:list)
        {
            if (!eklenecekler.contains(each))
            {
                eklenecekler.add(each);
            }

        }
        return eklenecekler;

    }
}
