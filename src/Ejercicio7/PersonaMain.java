package ejercicio7;

public class PersonaMain {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.crearPersona(persona1);

        try {
            persona1.esMayorDeEdad(persona1);

        } catch (Exception e) {
            System.out.println("La edad es null");
        }

        persona1.calcularIMC(persona1);

    }

}
