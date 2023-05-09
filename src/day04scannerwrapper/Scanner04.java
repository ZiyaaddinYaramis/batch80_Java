package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        // Örnek : Kullanicidan bir dikdörtgenin iki kenar uzunlugunu aliniz
        // a) Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        // b) Cevresini hesaplayiniz ==> 2 * Kisa kenar + 2 * Uzun kenar

        Scanner scan = new Scanner(System.in);

        System.out.println("Dikdörtgenin kisa kenar uzunlugunu giriniz");

        double shortSide = scan.nextDouble();

        System.out.println("Dikdörtgenin uzun kenar uzunlugunu giriniz");

        double longSide = scan.nextDouble();

        System.out.println("Dikdörtgenin Alani: " +(shortSide*longSide));
        System.out.println("Dikdörtgenin Cevresi: " +(2*shortSide+2*longSide));
    }
}
