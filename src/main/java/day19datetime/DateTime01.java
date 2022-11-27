package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateTime01 {
    public static void main(String[] args) {

        //Example 1: "Anlik tarihi"(Current Date) ekrana yazdiran kodu yaziniz
        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate); // 2022-10-21

        //Example 2: "Anlik zamani" (Current Time) ekrana yazdiran kodu yaziniz
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime); // 20:41:25.483949

        //Example 3: "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime); //2022-10-21T20:45:50.767836100

        //Example 4: Japonya'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);// 2022-10-22T02:50:43.450937100

        //Example 5: Istanbul'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);// 2022-10-21T20:52:20.501210800

        //Example 6: Bugunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz.
        LocalDate countDate = LocalDate.of(2022,10,21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);// 2024-12-18

        //Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz
        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);

        // between(dobAli, dobVeli) method'u kullanildiginda daha eski olan tarih once yazilmalidir
        Long diff = ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println(diff); // 2824

        //Example 8: Istanbul'un Fethi ile, Cumhuriyet'in kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz.
        //           29 Mayis 1453  ==> Istanbul'un Fethi              29 Ekim 1923 ==> Cumhuriyet'in kurulusu
        LocalDate istanbulunFethi = LocalDate.of(1453,5,29);
        LocalDate cumhuriyetKurulus = LocalDate.of(1923,10,29);

        long aySayisi = ChronoUnit.MONTHS.between(istanbulunFethi,cumhuriyetKurulus);
        System.out.println(aySayisi);// 5645

        //Example 9: Verilen tarih'in hangi burcta oldugunu gosteren kodu yaziniz
        LocalDate myDate = LocalDate.of(1989,5,7);
        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        if (day>=21 && month==3){
            System.out.println("Koc");
        } else if (day<=20 && month==4) {
            System.out.println("Koc");
        } else if (day>=21 && month==4) {
            System.out.println("Boga");
        } else if (day<=20 && month==5) {
            System.out.println("Boga");
        }

        //2.YOL:
        if ((day>=21 && month==3) || (day<=20 && month==4) ) {
            System.out.println("Koc");
        } else if ((day>=21 && month==4) ||  (day<=20 && month==5)) {
            System.out.println("Boga");
        }

    }
}
