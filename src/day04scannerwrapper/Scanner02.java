package day04scannerwrapper;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        
        
        // Örnek : kullanicidan adresini aliniz ve ekrana yazdiriniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz");


        // nextLine() methodu kullanicidan cok kelimeli string almak icin kullanilir
        String adress = input.nextLine();

        System.out.println("adress = " + adress);

        input.close();

    }
    
}

