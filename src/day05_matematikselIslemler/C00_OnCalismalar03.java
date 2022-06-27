package day05_matematikselIslemler;

public class C00_OnCalismalar03 {
    public static void main(String[] args) {

        // 5496 sayisinin rakamlar toplamini bulalim

        int sayi = 5496;
        int rakamlarToplami = 0;


      int rakam = sayi%10; // birler basamagini aldik

        rakamlarToplami+=rakam; // birler basamagini rakamlar toplamina ekledik 6

       sayi/=10;  //549

       rakam= sayi%10; // 9

       rakamlarToplami+=rakam; // onlar basamagini rakamlar toplamina ekledik

        sayi/=10; //54

        rakam= sayi%10; //4

        rakamlarToplami+=rakam; // yuzler basamagini rakamlar toplamina ekledik

        sayi/=10; // 5

        rakam = sayi % 10;

        rakamlarToplami+=rakam; // // binler basamagini rakamlar toplamina ekledik

        sayi/=10; // 0

        System.out.println("Rakamlar toplami : " + rakamlarToplami);
        System.out.println("Sayinin son degeri : " + sayi);



    }
}
