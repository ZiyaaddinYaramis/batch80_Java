package day24_constructors;

public class Rope {


    void swing(){
        System.out.println("swing");
    }


    public static void main(String[] args) {
        Rope rope =null;
        rope.swing();   // CTE vermez ama RTE verir
    }


}
