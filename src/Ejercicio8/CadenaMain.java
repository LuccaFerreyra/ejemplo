package ejercicio8;

import java.util.Scanner;

public class CadenaMain {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       Cadena Cadena1 = new Cadena ();
       Cadena1.crearCadena(Cadena1);
       Cadena1.mostrarVocales(Cadena1);
        System.out.println("Frase invertida: [" + Cadena1.invertirFrase(Cadena1)+ "]");
        System.out.println("Ingrese el caracter que desea buscar en la frase:");
       char letra = leer.next().charAt(0);
        System.out.println("Ingrese una nueva frase para comparar la longitud");
        String nuevaFrase = leer.next();
        Cadena1.compararLongitudFrase(Cadena1, nuevaFrase);
        System.out.println("Ingrese la frase que desea concatenar:");
        nuevaFrase = leer.next();
        Cadena1.Reemplazar(Cadena1, nuevaFrase);
        System.out.println("Ingrese el caracter a buscar en la frase:");
        String caracter = leer.next();
        Cadena1.Contiene(Cadena1, caracter);
        
    }
    
}
