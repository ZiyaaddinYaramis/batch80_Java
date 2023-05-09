package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
    Java da method nasil olusturulur?

    1) main method un disinda classin icinde olusturulur
    2) Access Modifier + return type + method ismi + () + {}

    Olusturulun method lar nasil kullanilir?
    1)Methodu olusturmak methodu calistirmak icin yeterli degildir, Kullanilmak istenen
      method main method unicinden kullanilir
    2) method un ismi + () yazin
        varsa islem yapacaginiz datalari parantezin icine koyun
        bu islem method call (method cagirma) olarak adlandirilir
    3) methodun ismi + parametreler ===> method signature
     */

    public static void main(String[] args) {
        int sonuc = toplamaYap(3,5);
        System.out.println("sonuc method'u caslisti " + sonuc);

        long carpmaSonucu = multiply(5,7);
        System.out.println("carpma method'u caslisti "+ carpmaSonucu);

        int carpTopla = firstTwoMultiplyThirdAdd(3,5,7);
        System.out.println("ucSayi method'u caslisti "+carpTopla);

        //System.out.println(firstTwoMultiplyThirdAdd(3,5,7));

    }

    //Ornek 1: toplama islemi yapan bir method olusturun ve kullaniniz
    public static int toplamaYap (int a,int b){

        return a+b;
    }

    //Ornek 2 sayiyi carpma islemi yapan bir method olusturun ve kullanin
    protected static long multiply(int a,int b ){
        return a*b;
    }


    //Ornek 3 verilen 3 sayidan ilk ikisini carpan ve ucuncu sayi ile sonucu toplayan methodu olusturun ve kullanin
    private static int firstTwoMultiplyThirdAdd(int a,int b,int c){
        return (a*b) +c;


        /*

        HOMEWORK
        Tekrar01 clası oluştur tüm yapılanları tekrar yap.
        1) Dikdörtgenin alanini hesaplayan methodu olusturun ve kullaniniz
        2) Dikdörtgenin cevresini hesaplayan methodu olusturun ve kullaniniz
        */
    }
}
