package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {
        readFileLineByLine();
    }

    public static void readFileLineByLine(){

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/day27exceptions/File1.txt"));

            String line = br.readLine();

            while(line!=null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlis ya da dosya silinmis - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak character veya characterler var - " + e.getMessage());
        }

    }
}