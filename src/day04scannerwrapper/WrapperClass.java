package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
        // primitive : char - boolean - byte - short - int - long - float - double
        // Wrapper Class : Character - Boolean - Byte - Short - Integer - Long - Float - Double


        int n = 12;
        // n yazip nokta koyarsaniz hic method göremezsiniz cunku primitive ler method icermez

        Integer m = 12;
        // m yazip nokta koyarsaniz bir cok method görebilirsiniz cunku wrapper classlar method icerir

        byte p = 33;
        Byte r = 33;


        // Örnek : short data type inin minimum ve maximum degerlerini kod yazarak bulunuz

        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);


    }
}
