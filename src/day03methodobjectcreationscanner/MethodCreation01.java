package day03methodobjectcreationscanner;

public class MethodCreation01 {
    public static void main(String[] args) {

        getCube(3);

        int getCube = getCube(3);
        System.out.println(getCube);
        System.out.println("getCube = " + getCube);
    }

    public static int getCube (int a){
        return a*a*a;
    }
}
