package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String a = "Java kolaydir.";


        boolean b = a.startsWith("va",2);  // 2. karakterden sonra va ile mi başlıyor
        //startsWith("kola",5) kodu ilk 5 karakter'den sonraki String'e bakar ve o String'in "kola" ile baslayip baslamadigini kontrol eder.
        boolean z = a.startsWith("kola",5); // 5. karakterden sonra kola ile başlıyor

        System.out.println(b);

        //replaceFirst("a", "*"); kod String deki ilk "a" yi "*" e cevirir.
        //replace ("a", "*"); kod String deki tum "a" lari "*" e ceviririz
        String c = a.replaceFirst("a","*");
        System.out.println(c); //J*va kolaydir.


        //concat() method'u iki tane String'i birbirine yapistirmaya yarar.
        //"Concatenation" islemi iki turlu yapilabilir; i) +  ile  ii)concat() ile
        // Java bir islem icin method uretmisse o method'u kullanmak "best practice" dir.
        String d = a.concat(" Anladin mi?");
        System.out.println(d); // Java kolaydir. Anladin mi?


        //trim() methodu bir String'in bas ve sonundaki "space" karakterlerini siler, aradaki "space" karakterlerine dokunmaz
        String e = "    Tom Hanks    ";
        String f = e.trim(); //"Tom Hanks"

        String h = "Java";
        String i = "Java";

        //h.compareTo(i); kod iki tane String'i alfabetik(lexicographic) olarak karsilastirir.
        // Buyuk harf e duyarlidir
        // Buyuk harf kucuk harf'e duyarli olmasini istemezseniz  h.compareToIgnoreCase(i); kullanabilirsiniz.
        //h.compareTo(i); kodda "h" nin alphabetik sirasindan  "i" nin alfabetik sirasi cikarilir.
        int k = h.compareTo(i);

        System.out.println(k);

        //Java Document'e  ulasmak icin Windows==> ctrl e basili tutun ve mouse ile method ismine tıklayin.
        //repeat(0); empty String return eder.
        //a.repeat(5); kodu "a" String'ini yanayana 5 kere yapistirir.
        String n = a.repeat(5);

        System.out.println(n);



    }
}
