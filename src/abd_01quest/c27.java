package abd_01quest;

public class c27 {
    /*Soru 27-) 'a' ile 'z' arasındaki karakterlerin ASCII değerlerini yazdıran bir Java programı yazın
ipucu: For Loop ve Char kullanarak çözebilirsiniz.
örnek:
Ascii value of a = 97
Ascii value of b = 98
Ascii value of c = 99
Ascii value of d = 100

     */
    public static void main(String[] args)
    {
        char a = 'a';
        char d = 'd';
        for (int i = a; i <=d ; i++)
        {

            System.out.println("Ascii value of " + (char)(i)+ " = " + i);


        }



    }
}
