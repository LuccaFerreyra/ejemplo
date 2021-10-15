package ejercicio8;

import java.util.Scanner;

public class Cadena {

    private Scanner leer = new Scanner(System.in);

    String Frase;
    int LongitudFrase;

    public Cadena(String Frase, int LongitudFrase) {
        this.Frase = Frase;
        this.LongitudFrase = LongitudFrase;
    }
      public Cadena() {
    }
    

    public String getFrase() {
        return Frase;
    }

    public void setFrase(String Frase) {
        this.Frase = Frase;
    }

    public int getLongitudFrase() {
        return LongitudFrase;
    }

    public void setLongitudFrase(int LongitudFrase) {
        this.LongitudFrase = LongitudFrase;
    }

    

    public void crearCadena(Cadena cadena) {
        System.out.println("Ingrese un frase:");
        String Frase = leer.next();

        int Longitud = Frase.length();
        cadena.setFrase(Frase);
        cadena.setLongitudFrase(Longitud);
    }

    public void mostrarVocales(Cadena cadena) {
        String Frase = cadena.getFrase();
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int j = 0; j < Frase.length(); j++) {
            switch (Frase.charAt(j)) {

                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;

                case 'i':
                    i++;
                    break;

                case 'o':
                    o++;
                    break;

                case 'u':
                    u++;
                    break;

                default:
                    System.out.println("La frase no contiene vocales");
                    break;
            }

        }
        System.out.println("La frase tiene: " + a + "vocal A");
        System.out.println("La frases tiene: " + e + "vocal E");
        System.out.println("La frase tiene: " + i + "vocal I");
        System.out.println("La frase tiene: " + o + "vocal O");
        System.out.println("La frase tiene: " + u + "vocal U");
    }

    public String invertirFrase(Cadena cadena) {
        String cadenaInvertida = "";
        for (int i = cadena.getFrase().length() - 1; i >= 0; i--) {
            cadenaInvertida = cadenaInvertida + cadena.getFrase().charAt(i);
        }
        return cadenaInvertida;
    }

    public void vecesRepetidas(Cadena cadena, char letra) {
        int contador = 0;
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            if (cadena.getFrase().charAt(i) == letra) {
                contador++;
            }

        }
        System.out.println("El caracter " + letra + " se repite " + contador + "veces");
    }

    public void compararLongitudFrase(Cadena cadena, String nuevaFrase) {
        if (cadena.getLongitudFrase() == nuevaFrase.length()) {
            System.out.println("Las dos frases tienen la misma longitud");
        } else {
            System.out.println("La longitud de la frase es distinta");
        }

    }

    public void unirFrase(Cadena cadena, String nuevaFrase) {
        String fraseConcatenada = cadena.getFrase().concat(nuevaFrase);
        System.out.println("La frase resulta es: [ " + fraseConcatenada + "]");

    }

    public void Reemplazar(Cadena cadena, String nuevaLetra) {
        String nuevaFrase = cadena.getFrase().replace("a", nuevaLetra);
        System.out.println("La frase resultante con caracteres reemplazados es: [" + nuevaFrase + "]");
    }

    public void Contiene(Cadena cadena, String letra) {
        if (cadena.getFrase().contains(letra) == true) {
            System.out.println("La frase contiene el caracter: [" + letra + "]");
            System.out.println("Frase: [" + cadena.getFrase() + "]");
        } else {
            System.out.println("La frase no contiene el caracter ingresado");

        }

    }

   
    }


