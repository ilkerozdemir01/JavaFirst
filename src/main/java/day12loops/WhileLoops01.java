package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
        //Example 1: 3 den 10 a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz

        for (int i = 3; i<11; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        //2.Yol:

        int i=3;

        while (i<11){
            System.out.print(i + " ");

            i++;

        }


        //Example 2: 17 den 4e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz

        int k =17;

        while (k>3){

            if (k%2==0){
                System.out.print(k + " ");
            }

            k--;
        }

        System.out.println();
        //Example 3: 12 den 67 e kadar sayilarin toplamini veren kodu yaziniz

        int sum=0;
        int m=12;

        while (m<68){

            sum = sum + m;

            m++;
        }
        System.out.println(sum);

        //Example 4: Size verilen bir tamsayini rakamlari toplamini ekrana yazdiran kodu yaziniz
        int sonuc = 0;
        int sayi = 385;
        while (sayi>0){
            sonuc = sonuc + sayi%10;
            sayi =sayi/10;
        }

        System.out.println(sonuc);

        //Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
        //           3 ==> 3x1=3   3x2=6   3x3=9   ...    3x10=30

        Scanner scan = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz");
        int s = scan.nextInt();

        int n = 1;

        while (n<11){


            System.out.println(s + "x" + n + " = " + s*n);

            n++;
        }












    }
}
