package abd_02quest;

public class c33 {
    /*
    Soru 33-)
Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir
Java programı yazın (boşluklar ve özel karakterler dahil).
Örnek:
String str=''Kodlama harika.''
String arr[]: ".etaerg si gnidoC"
İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın

     */

    public static void main(String[] args)
    {
        String str = "Kodlama harika.";
        String []splitStr=str.split("");

        String terstenStr="";
        String testenBirleştir="";


        for (int i = splitStr.length-1; i >=0 ; i--)
        {
            terstenStr+=splitStr[i];

        }
        System.out.println("===> " + str + "<===" + "'nın " +
                "Tersten yazılımı ===> " + terstenStr + " <===");




    }
}
