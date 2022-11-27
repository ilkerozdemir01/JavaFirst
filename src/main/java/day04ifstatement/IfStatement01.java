package day04ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar

        //Example 1: Sayi pozitif ise ekrana pozitif yazdirin.
        int s = 12;

        if (s>0){
            System.out.println("Positive");
        }

        //Example 2: Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdirin.
        char ch = 'A';
        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");

        }

        /*
        && islemi sadece boolean ile kullanilir
        true && true = true
        true && false = false
        false && true = false
        false && false = false
        && islemi mukemmelliyetcidir, true sonucunu alabilmek icin hersey true olmalidir.
        Bir tane false varsa sonuc false olur
         */

        //Example 3: Verilen bir sayi uc basamakli ise ekrana "Uc basamaklı yazdiriniz."

        int n = -120;

        n = Math.abs(n);

        if(n>99 && n<1000){ // n>=100 && n<999 veya n>99 && n<1000
            System.out.println("Uc basamakli");
        }

        //Example 4: Verilen bir sayi cift sayi ise ekrana cift sayi yazdiriniz.

        int p = -18;

        p = Math.abs(p);

        //"=" isareti atama operatorudur, matematikteki esittir anlamina gelmez.
        //Matematikteki esittir sembolu Java'da "==" seklindedir
        //2+3 == 5

        if(p%2==0){
            System.out.println("Çift sayi");

        }

        //Example 5: Verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana "Harika say" yazdirin

        int r =250;

        if (r<300 || r>1200){
            System.out.println("Harika sayi");

        }
        /*

             || islemi sadece boolean ile kullanilir.
                  true || true = true
                  true || false= true
                  false || true= true
                  false || false= false
            Not: || isleminde false alabilmek icin herseyin false olmasi gerekir.
                 || isleminde sadece bir tane true sonucu true yapmaya yeter

         */

        //Example 6: Kullanicidan yas al kullanicinin yasi 18 yasindan büyükse "üyelik almaya hak kazandınız"
        //18 den kücükse "üyelik alamazsınız".

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen yasinizi girin");
        int yas= input.nextInt();
        if (yas>18){
            System.out.println("Uyelik almaya hak kazandınız");

        }
        if (yas<18){
            System.out.println("Uyelik alamazsınız yasiniz yetersiz");

        }





    }
}
