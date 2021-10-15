package Ejercicio1;

import java.util.Scanner;

public class LibroMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Titulo;
        String Autor;
        int ISBN, NumeroPag;

        Libro libro1 = new Libro("El quijote de la mancha", "Cervantes", 123456, 300);
        Libro libro2 = new Libro();
        System.out.println("Ingrese Titulo:");
        Titulo = leer.next();
        System.out.println("Ingrese Autor");
        Autor = leer.next();
        System.out.println("Ingrese ISBN");
        ISBN = leer.nextInt();
        System.out.println("Ingrese Numero de pag");
        NumeroPag = leer.nextInt();

        libro2.setTitulo(Titulo);
        libro2.setAutor(Autor);
        libro2.setISBN(ISBN);
        libro2.setNumeroPag(NumeroPag);

        System.out.println("Libro 1 :");
        System.out.println("Titulo:" + libro1.getTitulo());
        System.out.println("Autor:" + libro1.getAutor());
        System.out.println("ISBN:" + libro1.getISBN());
        System.out.println("Numero de Pag:" + libro1.getNumeroPag());
        System.out.println();

        System.out.println("Libro 2 :");
        System.out.println("Titulo:" + libro2.getTitulo());
        System.out.println("Autor:" + libro2.getAutor());
        System.out.println("ISBN:" + libro2.getISBN());
        System.out.println("Numero de pag:" + libro2.getNumeroPag());
        System.out.println();

    }

}
