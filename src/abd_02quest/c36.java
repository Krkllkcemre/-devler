package abd_02quest;

public class c36 {
    /*
    Soru 36-)
Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
Örnek:
inputarr[]=   {1,2,3,4,5,6,7}
output:         4
İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz. Kendinizi geliştirme adına
sorunun cevabını degişik yollardan yapabilir, Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
     */

    public static void main(String[] args) {
       int inputarr[]=   {1,2,3,4,5,6,7,8,9};
       int orta =0;

      if (!(inputarr.length%2==0))
      {
          orta=(inputarr.length+1)/2;
          System.out.println(orta);
      }else {
          orta=(inputarr.length)/2;
          System.out.println(orta);
      }


    }
}
