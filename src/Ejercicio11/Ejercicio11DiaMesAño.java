package ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio11DiaMesAño {

    public static void main(String[] args) {
        int anio;
        int mes;
        int dia;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento");

        System.out.println("Año:");
        anio = leer.nextInt();

        System.out.println("Mes:");
        mes = leer.nextInt();

        System.out.println("Dia");
        dia = leer.nextInt();
        leer.close();

        LocalDate fechaDeNacimiento = LocalDate.of(anio , mes , dia);
        LocalDate fechaActual = LocalDate.now();

        System.out.println("La fechaa ingresada es:[" + fechaDeNacimiento + "]");
        System.out.println("La fecha actual es: [" + fechaActual + "]");

        System.out.println("Hay [ " + ChronoUnit.YEARS.between(fechaDeNacimiento , fechaActual) + "] años de diferencia , entre la fecha ingresada y la fecha actual.");

    }

}
