package ders25_staticKeyword;

public class AHemsireRunner {

    public static void main(String[] args) {


        AHemsire h1 = new AHemsire();

        h1.personelIsim= "Ayse";
        h1.personelAdresi= "Ulus";
        h1.personelTelefon= "3123425465";
        System.out.println(h1);



        AHemsire h2 =new AHemsire();
        System.out.println(h2);

        h2.personelIsim = "Hatice";
        h2.personelAdresi = "Sincan";
        h2.personelTelefon = "3124323232";
        h2.bashekimIsmi = "Yasar Kemal"; // static bir variable 'a atama yaptigimiz andan itibaren butun objelerin
                                         // ilgili degeri degisir  (bashekimIsmi    Yasar Kemal'dir)


        System.out.println("h1 : " + h1);
        System.out.println("h2 : " + h2);

        AHemsire h3 = new AHemsire();

        System.out.println(h3);


    }
}
