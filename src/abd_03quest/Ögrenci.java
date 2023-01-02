package abd_03quest;

import java.util.Scanner;

public class Ögrenci {
    /*
  Soru 44-)
Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
Changename adında bir method oluşturun,
parametre olarak öğrenci bilgileri alın ve methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
 Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.
     */
    public static void main(String[] args) {
        String isim= "abdullah";
        String sayad= "kul";
        int yaş=90;

        Changename(isim,sayad, yaş);

    }
    public static void Changename (String yenİsim,String yeniSoyad,int yeniYas)
    {
        yenİsim="hasan";
        yeniSoyad="güzel";
        yeniYas = 18;

        System.out.println(yenİsim + " " + Changesurname(yeniSoyad) + " " + yeniYas );
    }
    public static String Changesurname(String girilenSoyad) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yeni soyadinizi giriniz");
        return girilenSoyad = scan.next();
    }







}