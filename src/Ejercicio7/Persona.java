package ejercicio7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Persona {

    private Scanner leer = new Scanner(System.in);
    DecimalFormat formateador = new DecimalFormat("##.#");
    String Nombre;
    int Edad;
    String Sexo;
    int Peso;
    double Altura;

    public Persona() {
    }

    public Persona(String Nombre, String Sexo, int Peso, double Altura) {
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public void crearPersona(Persona persona) {

        System.out.println("Ingrese Nombre");
        String Nombre = leer.next();
        persona.setNombre(Nombre);
        System.out.println("Ingrese Edad");
        int Edad = leer.nextInt();
        persona.setEdad(Edad);
        do {
            System.out.println("Ingrese Sexo");
            String Sexo = leer.next();
            persona.setSexo(Sexo);

            if (Sexo.equals("H") || Sexo.equals("M") || Sexo.equals("O")) {
                persona.setSexo(Sexo);
            } else {
                System.out.println("Sexo INCORRECTO");
                persona.setSexo("");
            }
        } while (persona.getSexo().equals(""));

        System.out.println("Ingrese Peso");
        Peso = leer.nextInt();
        persona.setPeso(Peso);
        System.out.println("Ingrese Altura");
        double Altura = leer.nextDouble();
        System.out.println();
        System.out.println("=================================");
        System.out.println(" [ Persona Creada correctamente! ]");

    }

    public int calcularIMC(Persona persona) {
        int res;
        double Altura = persona.getAltura();
        int Peso = persona.getPeso();
        double imc = Peso / (Altura * Altura);

        if (imc < 20) {
            res = -1;
            System.out.println(persona.getNombre() + "Si indice de masa corporal es de: " + formateador.format(imc) + "Peso inferior al normal.");

        } else {
            if (imc >= 20 && imc <= 25) {
                res = 0;
                System.out.println(persona.getNombre() + "Su indice de masa corporal es:" + formateador.format(imc) + "Peso ideal");
            } else {
                res = 1;
                System.out.println(persona.getNombre() + "Su indice de masa corporal es de:" + formateador.format(imc) + "Tiene sobrepeso");
            }
        }
        return res;
    }

    public boolean esMayorDeEdad(Persona persona) {
        boolean esMayor;
        int Edad = persona.getEdad();
        if (Edad >= 18) {
            esMayor = true;
            System.out.println(persona.getNombre() + " Es mayor de edad.");

        } else {
            esMayor = false;
            System.out.println(persona.getNombre() + " Es menor de edad.");

        }
        return esMayor;
    }

}
