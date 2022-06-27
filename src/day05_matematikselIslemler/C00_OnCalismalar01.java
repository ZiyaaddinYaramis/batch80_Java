package day05_matematikselIslemler;

import java.util.Scanner;

public class C00_OnCalismalar01 {
    public static void main(String[] args) {
        //Soru 1)
        //Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 4 Basamakli bir sayi giriniz");

        int sayi = scan.nextInt();  //4321

        int birlerBasamagi= sayi%10; // 1

        sayi =sayi/10; //432

        int onlarBasamagi= sayi%10; // 2

        sayi = sayi/10; // 43

        int yuzlerBasamagi= sayi%10;

        sayi = sayi/10; // 4

        int binlerBasamagi = sayi%10;


        System.out.println("Girdiginiz sayinin rakamlar toplami : "+ (birlerBasamagi+onlarBasamagi+yuzlerBasamagi+binlerBasamagi));





    }
}
