package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {

        // Bir String'deki "m" karakteri haric tum karakterleri yazdiriniz
        // Andromeda ==> Andoreda

        String str = "Andmromedam";

        //1.YOL
        for (int i=0;  i<str.length()-1;  i++   ){
           char c = str.charAt(i);
           if (c!='m'){
               System.out.print(c);
           }

        }

        //2.YOL:
        for (int i=0;  i<str.length()-1;  i++   ){
            char c = str.charAt(i);
            if (c=='m'){
                continue; //Bosveeer  ==>  Loop'un icinde bazi degerler icin Loop'un calismamasini isterseniz "continue" kullaniniz
            }
            System.out.println(c);
        }

        //Example 2: 1'den 100'e kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz

        for (int i = 1;  i<101;   i++){
            if (i%6==0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();

        //Example 3: Size verilen bir String'deki 'm' den onceki karakterleri yazdiriniz
        //           Luxemburg ==> Luxe

        String s = "Luxemburg";

        for (int i=0; i<s.length(); i++){

           char c = s.charAt(i);

           if (c=='m'){
               break;
           }
            System.out.print(c);
        }










    }
}
