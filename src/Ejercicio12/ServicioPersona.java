package ejercicio12;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ServicioPersona {

    private Scanner leer = new Scanner(System.in);

    public Persona CrearPersona() {
        System.out.println("\nIngrese Nombre:");
        String Nombre = leer.next();

        System.out.println("\nIngrese Apellido");
        String Apellido = leer.next();

        System.out.println("\nIngrese Fecha de Nacimiento");
        System.out.println("Año:");
        int Anio = leer.nextInt();

        System.out.println("Mes");
        int Mes = leer.nextInt();

        System.out.println("Dia");
        int Dia = leer.nextInt();

        LocalDate FechaDeNacimiento = LocalDate.of(Anio, Mes, Dia);

        return new Persona(Nombre, Apellido, FechaDeNacimiento);

    }

    public void MostrarPersona(Persona persona) {
        System.out.println("----------------");
        System.out.println(persona.toString());
        System.out.println("----------------");
    }
    
    public int CalcularEdad(Persona persona) {
        LocalDate FechaDeNacimiento = persona.getFechaDeNacimiento();
        LocalDate FechaActual = LocalDate.now();
        int CalcularEdad = (int) ChronoUnit.YEARS.between(FechaDeNacimiento, FechaActual);
        return CalcularEdad;

    }

    public boolean MenorQue(Persona persona, int edad) {
        boolean EsMenor = false;

        int EdadPersona = CalcularEdad(persona);
        if (EdadPersona < edad) {
            EsMenor = true;

        } else {
            EsMenor = false;

        }
        return EsMenor;
    }

}
