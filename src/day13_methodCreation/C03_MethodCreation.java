package day13_methodCreation;

public class C03_MethodCreation {

    public static void main(String[] args) {
        // verilen 3 double sayinin ortalamasini yazdiran  bir method yazin
        // main method icinden cagirarak method'u calistirin


        ortalama(80,60,55);

    } // Mm sonu


    public static void ortalama(double sayi1,double sayi2,double sayi3){

        System.out.println("Girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2+sayi3)/3);

    }
} // C sonu
