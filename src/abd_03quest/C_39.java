package abd_03quest;

import java.util.Arrays;
import java.util.Scanner;

public class C_39 {
    public static void main(String[] args) {
       /* Soru-39)
        Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve verilen bu (Arrayden)
         diziden minimum ve maksimum sayıları yazdıran bir yöntem yazın
        Örnek:
        Input : {3,2,5,4,1,6}
        Output :
        min: 1
        max: 6
        Ipucu: sort yöntemni kullanabilirsiniz.

        */


        int []arr={3,2,5,4,1,6};
        Arrays.sort(arr);
        int min=arr[0];
        int max=arr[arr.length-1];
        System.out.println(" minimum =  " + min+ " maximum ="+max);
    }
}
