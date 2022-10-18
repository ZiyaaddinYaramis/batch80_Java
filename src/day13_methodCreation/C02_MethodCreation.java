package day13_methodCreation;

public class C02_MethodCreation {

    public static void main(String[] args) {

        // Bir method'u calistirmak icin main method'un icinden cagirmaniz gerekir
        //  Bir Method'u cagirmak icin ise method adini ve  parametrelere uygun argument'leri
        // yazmaliyiz


        ortalama(85.2,90.3); // METHOD CALL

    }


    // bir method olusturmak istedigimizde class'in icinde ama main method'un disinda
    // bir alanda olusturmaliyiz. Genel kullanim method'lar main method'dan sonra olur



    public static void ortalama (double sayi1, double sayi2) {

        System.out.println("Girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);
        // Bir method'u olusturmak o method'u calistirmak icin yeterli degildir.
        // olusturulan method main method icinden cagrilinca calisir.
    }



} // Class sonu
