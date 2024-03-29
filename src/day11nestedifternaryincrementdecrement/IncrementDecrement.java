package day11nestedifternaryincrementdecrement;

public class IncrementDecrement {
    public static void main(String[] args) {
        //Increment
        int a = 5;
        System.out.println(a);//5

        a = a + 2;
        System.out.println(a);//7

        a += 2;
        System.out.println(a);//9

        //Ornek : Bir tane integer variable olusturun ve onu iki sekilde 5 artirin.
        int b = 10;
        System.out.println(b);//10

        b = b + 5;
        System.out.println(b);//15

        b += 5;
        System.out.println(b);//20

        //Decrement
        int c = 8;
        System.out.println(c);//8

        c = c - 3;
        System.out.println(c);//5

        c -= 3;
        System.out.println(c);//2

        //Increment 2
        int d = 6;
        System.out.println(d);//6

        d = d * 2;
        System.out.println(d);//12

        d *= 2;
        System.out.println(d);//24


        //Decrement 2

        int e = 24;
        System.out.println(e);//24

        e = e / 2;
        System.out.println(e);//12

        e /= 2;
        System.out.println(e);//6

        //"1" ile increment

        int f = 12;
        //f=f+1;
        //f+=1;
        f++;

        //"1" ile decrement

        int h = 10;
        // h=h-1;
        //h-=1;
        h--;

        //"post-increment" ve "pre-increment"

        int i = 10;
        int k = i++;//post incerement

        System.out.println(k);//10 ==> i artirilmadan "k" ya konuldugu icin "k" nin degeri 10 olur
        System.out.println(i);//11 ==> i satir sonunda artirildigi icin 1 nin degeri 11 olur


        int m = 15;
        int n = ++m;//pre incerement
        System.out.println(m);//16
        System.out.println(n);//16

        //Ornek
        int p = 17;
        int r = p--;

        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;

        int t = --s;

        System.out.println(s);
        System.out.println(t);

        /*
        1)Increment artirmak demektir, decrement azaltmak demektir.
        2) Increment toplama ve carpma ile, decrement cikarma ve bolme ile yapilabilir
                a)i=i+5;
                b)i+=5;
                c)eger 1 ile artirma ==> i++
                note:bu c sikki sadece 1 artirmak icin kullanilir

                a)i=i-5;
                b)i-=5;
                c)eger 1 ile azaltma ==> i--
                note:bu c sikki sadece 1 azaltmak icin kullanilir

         */

    }
}
