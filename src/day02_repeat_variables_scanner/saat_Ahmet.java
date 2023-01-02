package day02_repeat_variables_scanner;

public class saat_Ahmet
{
    public static void main(String[] args)
    {

        int basş=5;
        int son=5;

        for (int i = 5; i >0; i--)
        {
            System.out.println(" ");

            for (int j =0; j <10 ; j++)
            {
              if (basş==j|| son==j)
              {
                  System.out.print("* ");
              }else
              {
                  System.out.print(" ");
              }

            }
            basş=basş-1;
            son=son+1;

        }
        System.out.println("");
        System.out.println("************");






    }



}


