package day05_matematikselIslemler;

import java.util.Scanner;

public class C00_OnCalismalar02 {
    public static void main(String[] args) {

        // Kullanicidan 4 basamakli bir sayi alalim ve
        // sayinin basamaklarini ters sirada yazdiralim

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen 4 basamakli bir sayi giriniz");

        int sayi = scan.nextInt();

        int birlerBasamagi=sayi%10; // sayimiz 4 basamakli  4321

        sayi/=10; // sayimiz 3 basamakli  432

        int onlarBasamagi= sayi%10;

        sayi/=10; // sayimiz 2 basamakli 43

        int yuzlerBasamagi= sayi%10;

        sayi/=10; // sayimiz tek basamakli 4

        int binlerBasamagi= sayi%10;  // kodumuzun dinamik olmasi icin yaptik

        // int binlerBasamagi = sayi/10 ==> yapilabilirdi ama dinamik olmazdi
        // dusunun ki kullanici 5 basamakli sayi girdi


        // ters sirada yan yana yazdiralim
        System.out.print(birlerBasamagi);
        System.out.print(onlarBasamagi);
        System.out.print(yuzlerBasamagi);
        System.out.println(binlerBasamagi);


        // 2 yol
        System.out.println(""+birlerBasamagi+onlarBasamagi+yuzlerBasamagi+binlerBasamagi);




    }
}
