package abd_03quest;

public class Takım
{

        /*Soru 43-)
        Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
        Bu const. kullanarak en az
    2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
        Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını
        sayısını gönderelim sonra cagırıp konsolda yazdıralım.

         */
        public static void main(String[] args)
        {

             Takım renkFarklı= new Takım();
             Takım Gs=new Takım("galata","saray");

             System.out.println(Gs.toString() + "\n" + renkFarklı.toString());

        }

     String renk ="sarı";
     String renk2 ="beyaz";

     String arma = "ASLAN";


     public Takım(String renk, String renk2)
     {
          renk=renk;
          this.renk2="kırmızı";

     }
     public Takım()
     {
         arma= arma;
     }
     public String toString() {


          return renk+renk2+arma;
     }







}
