package ejercicio10;

import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {
        double arrayA[] = new double[50];
        double arrayB[] = new double[20];

        for (int i = 0; i < arrayA.length; i++) {

            arrayA[i] = Math.round(Math.random() * 100);
        }
        Arrays.sort(arrayA);

        arrayB = Arrays.copyOf(arrayA, 20);
        Arrays.fill(arrayB, 10, 20, 30);

        System.out.println("---------------------");
        System.out.println("[MOSTRANDO ARREGLO A]");
        System.out.println("---------------------");

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("[" + arrayA[i] + " ]");
        }
        System.out.println();

        System.out.println("------------------");
        System.out.println("[ARREGLO B]");
        System.out.println("-------------------");

        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("[" + arrayB[i] + "]");
        }
    }

}


