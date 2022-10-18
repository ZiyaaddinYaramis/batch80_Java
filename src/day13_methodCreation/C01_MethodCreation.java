package day13_methodCreation;

public class C01_MethodCreation {

    public static void main(String[] args) {

        String str ="Java cok guzel";

        //1 ) Java method'larin sadece ismine degil isim, + argument'lere bakar
        // sadece parametre sayisi degil paremetre'lerin data tiplerine  de bakar

        str.endsWith("el");

        // Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
        // bu method'u kullanmak icin bu method'un kontrol ettikten sonra
        // bana rapor olarak ne getirdigini bilmem lazim (true/false)



        // 2) Bir method olusturdugumuzda  method'un ne yapacagina
        // ve gorevi yaptiktan sonra bana ne döndurecegine bastan karar vermeliyiz



        // 3) Bir method olustururken  " str.indexOf(String str, int FromIndex) "
        // de oldugu gibi
        // disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
        // deklare etmeliyiz



        // Method'u calistirmak istedigimizde  (Method'u cagirmak) Parametre olarak
        // declare edilen data tiplerine uygun degerler girmeliyiz.
        // girilen bu degerlere ARGUMENT denir.


        str.indexOf("va", 1);
    }
}
