import java.util.Scanner;  //scanner kütüphanesi
import java.util.concurrent.TimeUnit; //delay kütüphanesi
import java.util.Random;              //rastgele sayı üretmek için
public class Main {
    public static void main(String[] args) throws InterruptedException { //ms fonksiyonunu sorunsuz kullanmak için throws
        String renk[]={" YESİL "," SİYAH ","KIRMIZI"};
        int sayi[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36};

        int bakiye,renk1Carpan=2,renk2Carpan=5,sayıCarpan=10;
//karşılama başlangıç
        for(int i = 0;i<4;i++){
            TimeUnit.MILLISECONDS.sleep(300);
            System.out.print(".");
        }System.out.println();

        char greeting[]={'W','E','L','C','O','M','E',' ','T','O',' ','R','O','U','L','E','T','T','E'};
        for(int i = 0;i<greeting.length;i++){
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.print(greeting[i]);
        }System.out.println();

        for(int i = 0;i<4;i++){
            TimeUnit.MILLISECONDS.sleep(300);
            System.out.print(".");
        }System.out.println();

        System.out.println("KURALLAR: ");
        System.out.println("          - 3 Renk (kırmızı, siyah, yeşil) renk tutturmak içeride olan paranızı ikiye katlar, yeşil ise 5.");
        System.out.println("          - 0-36 arası bir sayı seçip kazanırsanız içeride olan paranızı 10'a katlanır.");
        System.out.println("          - renk veya sayı gelmezse para kasada kalır.");

        for(int i = 0;i<4;i++){
            TimeUnit.MILLISECONDS.sleep(300);
            System.out.print(".");
        }System.out.println();
//<<<<<karşılama sonu>>>>
//<<<<<oyun başlangıç>>>>>
    //<<<bahis başlangıç>>>>>
        System.out.println("OYUN BAŞLIYOR");
        TimeUnit.MILLISECONDS.sleep(300);
        System.out.println("Bahis miktarı : ");

        Scanner ba = new Scanner(System.in);
        bakiye = ba.nextInt();
        if(bakiye<100){
            System.out.println("yetersiz bakiye");
            System.out.println("minimum bahis 100");
            Scanner bb = new Scanner(System.in);
            bakiye = bb.nextInt();
        }
    //<<<bahis son>>>>>
        boolean devam=true;
    //<<<<inner başlangıç>>>>
        do{
        //<<<<önceki tur bakiye kontrol başlangıç>>>>
            if(bakiye<100){
                System.out.println("**YETERSİZ BAKİYE**");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.println("Oynanacak tutar: ");
                Scanner bb = new Scanner(System.in);
                bakiye = bb.nextInt();
            }
        //<<<<önceki tur bakiye kontrol sonu>>>>
            System.out.println("Yeni bakiye [ "+bakiye+" ]");
        //<<<<<kategori başlangıç>>>>
            System.out.println("Renk [1] - Sayı[2]");
            Scanner x = new Scanner(System.in);
            int tur=x.nextInt();
            if(tur>2||tur<1){
                System.out.println("hatalı seçim");
                break;
            }else if (tur==1){
            //<<<<<renk oyunu başlangıç>>>>>
                System.out.println("Renk [1]" );
                TimeUnit.MILLISECONDS.sleep(300);
                System.out.println("Bir Renk seçiniz.");
                for(int i=0;i<renk.length;i++){
                    System.out.println(" [" + renk[i]+"] için ["+(i+1)+"]");
                }System.out.println();
                Scanner t = new Scanner(System.in);
                int rnk=t.nextInt();
                System.out.println("SEÇİLEN : [" + renk[rnk-1] +"]");
                TimeUnit.MILLISECONDS.sleep(300);
                System.out.println("TOP ATILDI");
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.println("BİLGİSAYARIN SEÇTİGİ RENK");
                for(int i = 0;i<4;i++){
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print("-");
                }
                Random randColor = new Random();
                int ran_color = randColor.nextInt(2);
                System.out.println("["+renk[ran_color]+"]");

                if((rnk-1)==ran_color){
                    TimeUnit.MILLISECONDS.sleep(200);
                    System.out.println("*******KAZANDIN*******");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.println("mevcut bakiye"+ bakiye);
                    if(ran_color == 0){
                        bakiye*=renk2Carpan;
                    }else
                        bakiye*=renk1Carpan;
                    System.out.println("yeni bakiye : "+bakiye);
                }else {
                    TimeUnit.MILLISECONDS.sleep(200);
                    System.out.println("Kaybettin");
                    bakiye=0;
                }
            //<<<<<renk oyunu sonu>>>>>
            //<<<<<sayı oyunu başlangıç>>>>>
            }else if (tur==2){
                System.out.print("Sayı [2]  ");
                TimeUnit.MILLISECONDS.sleep(300);
                System.out.println("Bir Sayı seçiniz.");
                for(int i =0;i< sayi.length;i++){
                    System.out.print(" ["+sayi[i]+"] ");
                    if(i==18)
                        System.out.println();
                }System.out.println();
                System.out.print(": ");
                Scanner sayi0 = new Scanner(System.in);
                int Sayi1=sayi0.nextInt();
                System.out.println("seçilen sayı ["+Sayi1+"]");
                TimeUnit.MILLISECONDS.sleep(300);
                System.out.println("BİLGİSAYARIN SEÇTİGİ SAYI");
                for(int i = 0;i<4;i++){
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print("-");
                }
                Random randNum = new Random();
                int rand_num = randNum.nextInt(37);

                System.out.println("["+rand_num+"]");
                if(Sayi1==rand_num){
                    TimeUnit.MILLISECONDS.sleep(200);
                    System.out.println("*******KAZANDIN*******");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.println("mevcut bakiye :"+ bakiye);
                    bakiye*=sayıCarpan;
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.println("Yeni bakiye: "+ bakiye);
                }else {
                    TimeUnit.MILLISECONDS.sleep(200);
                    System.out.println("Kaybettin");
                    bakiye=0;
                }
            //<<<<<sayı oyunu sonu>>>>>
            }
        //<<<<<kategori başlangıç>>>>

            System.out.println("kalan bakiye: "+ bakiye);

            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println();
            System.out.println("Devam etmek için [1] - Oyunu bittirmek için [0] ı tuşla1");
            Scanner n = new Scanner(System.in);
            int devamm=n.nextInt();
            if(devamm==0){
                devam=false;
            } else if (devamm==1) {

            }else {
                System.out.println("hatalı karakter");
                TimeUnit.MILLISECONDS.sleep(200);
                break;
            }
        }while(devam);
    //<<<<inner başlangıç>>>>
//<<<<<oyun son>>>>
    }
}