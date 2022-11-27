package day28abstraction;

public abstract class Animal {

    //bodysi olmayan method'lar "abstract method" olarak adlandirilirlar.
    //Bir method'u abstract yapmak icin;  i)Method body'i sil   ii)"abstract" keyword kullan
    public abstract void eat();

    //"abstract class" larda hem "abstract" hem de "concrete"(non-abstract) method kullanilabilir
    public void drink(){
        System.out.println("Animals drink...");
    }

    //abstract "move" method olusturunuz
    public abstract void move();
}
