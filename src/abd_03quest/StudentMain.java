package abd_03quest;

import java.util.Scanner;

public class StudentMain
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ad giriniz");
        String ögrencİsim = scan.nextLine();
        System.out.println("Lutfen  soyadinizi giriniz");
        String ögrencSoyad = scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextByte();
        System.out.println("Lutfen sınıfınız giriniz");
        char cinsiyet = scan.next().charAt(0);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        char sınıf = scan.next().charAt(0);


        Student ögrenci= new Student(ögrencİsim,ögrencSoyad,yas,cinsiyet,sınıf);

        System.out.println(ögrenci.toString());


    }
}
