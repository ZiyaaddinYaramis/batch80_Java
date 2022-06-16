package day03_scanner;

import java.util.Scanner;

public class C09_Odevler {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Soru 1) Kullanicidan iki tam sayi alip bu sayilarin toplam, fark ve carpimlarini yazdiriniz.



        System.out.println("Lutfen  ard arda iki tam sayi giriniz \naralarda Enter tusuna basiniz");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Girdiginiz sayailarin toplami : " + (num1 + num2) +
                "\nGirdiginiz sayilarin farki : " +(num1-num2)+
                "\nGirdiginiz sayilarin carpimi : "+ (num1*num2) );


        // *************************************
        // *************************************
        // *************************************




        // Soru 2) Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin.

        System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz");

        double kareninKenarUzunlugu = scan.nextDouble();

        System.out.println("Karenin cevresi : " + (kareninKenarUzunlugu*4) +
                "\nKarenin alani : "+ (kareninKenarUzunlugu*kareninKenarUzunlugu));



        // *************************************
        // *************************************
        // *************************************




        //Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve cemberin alanini hesaplayip yazdirin.


        System.out.println("Lutfen cemberin yaricapini giriniz");

        double yaricap = scan.nextDouble();

        System.out.println("Cemberin cevresi : "+( 2*3.14*yaricap)+
                "\nCemberin alani : "+ (3.14*yaricap*yaricap));



        // *************************************
        // *************************************
        // *************************************




        //Soru 4) Kullanicidan dikdörtgenler prizmasinin uzun,kisa kenarlarini ve
        // yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin.


        System.out.println("Lutfen sirasi ile dikdörtgenler prizmasinin; " +
                "\nuzun kenarini, kisa kenarini ve yuksekligini giriniz" +
                "\naralarda Enter tusuna basiniz");

        double uzunKenar = scan.nextDouble();
        double kisaKenar = scan.nextDouble();
        double yukseklik = scan.nextDouble();

        System.out.println("Dikdortgenler prizmasinin hacmi : " + (uzunKenar*kisaKenar*yukseklik) );



        // *************************************
        // *************************************
        // *************************************




        //Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin

        // Isminiz : Mehmet
        // Soyisminiz : Bulut
        // Kursumuza katiliminiz alinmistir, tesekkur ederiz


        System.out.println("Lutfen önce isminizi giriniz sonra soyisminizi giriniz"+
                "\naralarda Enter tusuna basiniz");


        String name = scan.next();
        String surname = scan.next();

        System.out.println("Isminiz : " + name
                + "\nSoyisminiz : " + surname
                + "\nKursumuza katiliminiz alinmistir, tesekkur ederiz");




        // *************************************
        // *************************************
        // *************************************




        //Soru 6) Kullanicidan ismini ve sosismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin

        //                Isim - soyisim : Mehmet Bulutluoz

        System.out.println("Lutfen önce isminizi giriniz sonra soyisminizi giriniz"+
                "\naralarda Enter tusuna basiniz");

        String isim = scan.next();
        String soyisim = scan.next();


        System.out.println("Isim - soyisim : "+ isim+ " " +soyisim);



    }
}
