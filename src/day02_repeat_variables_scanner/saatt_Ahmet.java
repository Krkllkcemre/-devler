package day02_repeat_variables_scanner;

public class saatt_Ahmet {
    public static void main(String[] args) {

        int input = 5;

        for (int i = 0; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                if (j > 1 && j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }

            System.out.println(" ");
        }

        for (int i = input - 1; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                if (j>1&&j<i)
                {
                    System.out.print("  ");

                }else {System.out.print("* ");}


            }
            System.out.println(" ");


        }

    }

}












