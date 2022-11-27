package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    /*
       Not: char variable'lari matematiksel islemlerde kullanirsaniz, Java onların ASCII degerlerini kullanir.
       Ornegin: System.out.println('A' + 'C'): ekrana AC yerine 132 yazdırır
       Not: Java'da "+" sembolunun iki anlami vardir. i)Toplama islemi ii)Birlestirme islemi(Concatenation)
       Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya calisir.
       o da olmazsa hata verir.
     */
    public static void main(String[] args) {

        //Example1 : Kullanicidan ilk ve soy ismini aliniz, ilk ve soy isminin ilk harflerini yazdiriniz
        //          Ali Can ==> AC

        Scanner input = new Scanner(System.in);
       //1.Yol
//        System.out.println("Ilk isminizi giriniz...");
//        char ilk = input.next().charAt(0);//A
//
//        System.out.println("Soy isminizi giriniz...");
//        char son = input.next().charAt(0);//C
//
//        System.out.println("" + ilk + son);

        //2.Yol:
        System.out.println("Tam isminizi giriniz...");
        String tamIsim = input.nextLine();// Ali Can

        char ilkHarf=tamIsim.charAt(0);

        System.out.println(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);
    }
}
