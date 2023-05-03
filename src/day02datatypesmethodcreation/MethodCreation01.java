package day02datatypesmethodcreation;

public class MethodCreation01 {



    public static void main(String[] args) {
        int sonuc = toplamaTap(3,5);
        System.out.println("sonuc method'u caslisti " + sonuc);

        long carpma = multiply(5,7);
        System.out.println("carpma method'u caslisti "+ carpma);

        int carpTopla = ucSayi(3,5,7);
        System.out.println("ucSayi method'u caslisti "+carpTopla);

    }

    public static int toplamaTap (int a,int b){

        return a+b;
    }

    protected static long multiply(int a,int b ){
        return a*b;
    }


    private static int ucSayi(int a,int b,int c){
        return (a*b) +c;
    }
}
