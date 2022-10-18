package day13_methodCreation;

public class C03_MethodCreation {

    public static void main(String[] args) {
        // verilen 3 double sayinin ortalamasini yazdiran  bir method yazin
        // main method icinden cagirarak method'u calistirin


        ortalama(80,60); // 2.yi calistirir ve sonuc olarak 70 yazdirir.
        ortalama(80,60,55); // 1.yi calistirir ve sonuc olarak  65 yazdirir.

    } // Mm sonu


    public static void ortalama(double sayi1,double sayi2,double sayi3){

        System.out.println("Girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2+sayi3)/3);

    }


    public static void ortalama (double sayi1, double sayi2) {

        System.out.println("Girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);
    }
} // C sonu
