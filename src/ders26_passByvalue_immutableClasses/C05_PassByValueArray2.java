package ders26_passByvalue_immutableClasses;

import java.util.Arrays;

public class C05_PassByValueArray2 {

    public static void main(String[] args) {

        // bir method olusturun
        // sayilar array'inin uzunlugundan 2 fazla olan
        // ve elementlerin tamami 5 olan yeni bir array olusturup
        // deger olarak sayilar array'ine atayin ve sayilar array'ini yazdirin


        int[] sayilar= {3,4,5,6};

        arrayeYeniDegerAta(sayilar);

        System.out.println("Method call'dan sonra main method'da sayilar array : " + Arrays.toString(sayilar)); // [3, 4, 5, 6]


    }


    public static void arrayeYeniDegerAta(int[] sayilar){

        int[] yeniArray = new int[sayilar.length+2];


        for (int i = 0; i < yeniArray.length ; i++) {
            yeniArray[i]=5;
        }



        sayilar=yeniArray;

        System.out.println("Method'da sayilar'in son hali : " + Arrays.toString(sayilar)); // [5, 5, 5, 5, 5, 5]
    }

}
