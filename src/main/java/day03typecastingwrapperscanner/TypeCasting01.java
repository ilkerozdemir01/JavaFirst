package day03typecastingwrapperscanner;

public class TypeCasting01 {

    // Type Casting : Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
    //        byte <  short  < int < long  < float  < double

    //Note : Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir.
    //Note : Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir.
    public static void main(String[] args) {

        byte age = 23;

        int newAge = age;

        long population =1234;

        int newPopulation = (int)population;

        // Example 1: shortu double ceviren kodu yazın
        short numOfStudents = 235;
        double newNumOfStudents =numOfStudents; //Auto Widening

        // Example 2:  floati byte yapan kodu yazınız
        float price = 12.99F;

        byte newPrice =(byte)price;  // Explicit Narrowing

        System.out.println(newPrice); //12 == Java ondalik sayiyi, tam sayiya cevirirken yuvarlama islemi yapmaz.
                                      // Java ondalik sayiyi, tam sayiya cevirirken ondalik kismini siler.

        int number = 515;
        byte newNumber =(byte)number;
        System.out.println(newNumber);// 3 Java 515i 256(bytedaki sayiların sayisi)'na boldu kalanı return attı.

        int num = 510;

        byte newNum = (byte)num;

        System.out.println(newNum);// -2



    }


}
