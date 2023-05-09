package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        // Örnek : Kullanicidan alacaginiz 5 basamakli bir sayinin  ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int number = scan.nextInt();




        // 12345
        int birlerBasamagi = number % 10;

        number = number /10; //1234

        int onlarBasamagi = number % 10;

        number = number / 10; //123

        int yuzlerBasamagi = number % 10;

        number = number / 10; //12

        int binlerBasamagi = number % 10;

        number = number / 10;

        int onBinlerBasamagi= number;

        System.out.println(birlerBasamagi+onlarBasamagi+binlerBasamagi+onBinlerBasamagi); //12







    }
}
