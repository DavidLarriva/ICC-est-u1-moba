import java.util.Scanner;
public class App {

    public static void main(String[] args) {

        Moba moba = new Moba();

        int[] array = moba.crearArray();

        System.out.println("");

        moba.ordenamientoBurbuja(array);

        System.out.println("");

        System.out.println("Arreglo ordenado:");

        moba.printArray(array);



        

        

        

        

        

    }
}