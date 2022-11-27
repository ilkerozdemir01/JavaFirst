package day02methodcreation;

public class MethodCreation {
    public static void main(String[] args) {


        System.out.println(toplamaYap(1.2,5));
        System.out.println(ucSayiyiCarp(2, 1.5, 6));
        System.out.println(ilkIkiToplaUcuncuCarp(4,8,9.5));

        //sout otomatik komut System.out.println()
        // Ekrana bir sey yazdirmak icin iki tane kod var
        // 1)System.out.println() satır bası yapar  2)System.out.print() satır bası yapmaz


    }
    //Example 1: Toplama islemi yapan bir method olusturunuz.
    public static double toplamaYap(double a, double b){

        return a+b;

    }

    //Example 2: Uc sayiyi birbiri ile çarpan bir methot olusturunuz
    public static double ucSayiyiCarp(double a, double b,double c){
        return a*b*c;
    }

    //Example 3: Uc sayidan ilk ikisini toplayıp ucuncu ile carpan method olusturup.
    //  sonucu ekrana yazdırın.
    public  static double ilkIkiToplaUcuncuCarp(double a, double b,double c){
        return (a+b)*c;
    }
}
