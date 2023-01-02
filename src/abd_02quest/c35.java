package abd_02quest;

import java.util.Arrays;

public class c35 {
    /*
    Soru 35-)
Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
		--> toCharArray() yöntemini kullanmayın
Örnek:
		String isim:    Yakup
		char arr[]:     [Y,a,k,u,p]
İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin.
 Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin

     */
    public static void main(String[] args) {



    String isim = "Emre";
       char[]bÖLİsim= chrArr(isim);
        System.out.println(Arrays.toString(bÖLİsim));

    }
public static char []chrArr (String ad)
{
    char[]arr = new char[ad.length()];
    for (int i = 0; i < ad.length(); i++)
    {
        arr[i]=ad.charAt(i);

    }return arr;


}




}

