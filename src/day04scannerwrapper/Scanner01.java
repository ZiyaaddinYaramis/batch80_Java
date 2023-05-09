package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Örnek : Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda yazdiriniz

        System.out.println("Lutfen ilk isminizi giriniz");

       // String ilkIsim = scan.nextLine();  nextLine() methodu tum metni aralarindaki bosluklarla beraber alir

        String firstName = scan.next();

        System.out.println("Lutfen soy isminizi giriniz");

        String lastName = scan.next();


        System.out.println("ilkIsim + soyIsim = "+ firstName + lastName);



    }
}
