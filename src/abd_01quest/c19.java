package abd_01quest;

import java.util.Scanner;

public class c19
{

/*    Soru 19-)
    Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
            ipucu:
    Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.*/
public static void main(String[] args) {


    Scanner scanner=new Scanner(System.in);
    System.out.println("Lütfen burcunuz için gün girin.");
    int gun = scanner.nextInt();
    System.out.println("Lütfen burcunuz için ay girin.");
    int ay = scanner.nextInt();
    String burc=null;

    if(ay==1){
        if(gun<=19){burc="oğlak";}
        if(gun>19){burc="kova";}
    }
    if(ay==2){
        if(gun<=18){burc="kova";}
        if(gun>18){burc="balık";}
    }
    if(ay==3){
        if(gun<=19){burc="balık";}
        if(gun>19){burc="koç";}
    }
    if(ay==4){
        if(gun<=19){burc="koç";}
        if(gun>19){burc="boğa";}
    }
    if(ay==5){
        if(gun<=20){burc="boğa";}
        if(gun>20){burc="ikizler";}
    }
    if(ay==6){
        if(gun<=21){burc="ikizler";}
        if(gun>21){burc="yengeç";}
    }
    if(ay==7){
        if(gun<=22){burc="yengeç";}
        if(gun>22){burc="aslan";}
    }
    if(ay==8){
        if(gun<=22){burc="aslan";}
        if(gun>22){burc="başak";}
    }
    if(ay==9){
        if(gun<=22){burc="başak";}
        if(gun>22){burc="terazi";}
    }
    if(ay==10){
        if(gun<=22){burc="terazi";}
        if(gun>22){burc="akrep";}
    }
    if(ay==11){
        if(gun<=21){burc="akrep";}
        if(gun>21){burc="yay";}
    }
    if(ay==12){
        if(gun<=21){burc="yay";}
        if(gun>21){burc="oğlak";}
    }
    System.out.println("Burcunuz:"+burc);
}
}







































