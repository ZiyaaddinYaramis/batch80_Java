package day24_constructors;

public class Rope {

    // Constructor ve contructor call olusturalim


    Rope(){
        this("Hasan"); // constructer call
    }

    Rope(String isim){

    }

    Rope(int sayi1, int sayi2){

    }


    void swing(){
        System.out.println("swing");
    }


    public static void main(String[] args) {
        Rope rope =null;
        rope.swing();   // CTE vermez ama RTE verir
    }


}
