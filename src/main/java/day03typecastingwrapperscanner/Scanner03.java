package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin en ve boyutu alip alan ve cevresini hesaplayan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenarini giriniz...");

        int en = input.nextInt();

        System.out.println("Dikdortgenin uzun kenarini giriniz...");

        int boy = input.nextInt();

        System.out.println("Alan "+ en*boy);
        System.out.println("Cevre "+ (en+boy)*2);


    }
}
