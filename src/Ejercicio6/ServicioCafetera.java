package ejercicio6;

import java.util.Scanner;

public class ServicioCafetera {

    private Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {
        System.out.println("Ingrese la cantidad de la cafereta:");
        int CantidadMax = leer.nextInt();
        System.out.println("Ingrese la cantidad actual de la cafetera:");
        int CantidadActual = leer.nextInt();
        return new Cafetera(CantidadMax, CantidadActual);

    }

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCantidadMax());
        System.out.println("Se lleno por completo");
    }
        public void servirTaza(Cafetera cafetera){
        System.out.println("Ingrese el tamaño de la taza:");
        int TamanoTaza = leer.nextInt();
        int CanActual = cafetera.getCantidadActual();
        int Calculo = CanActual - TamanoTaza;
        if (CanActual < TamanoTaza) {
            System.out.println("No se pudo llenar la taza de cafe ya que la cantidad de cafe que quedaba era: " + CanActual);
            System.out.println("Faltaron" + Math.abs(Calculo) + " miliLitros para llenar la taza");
            cafetera.setCantidadActual(0);
        } else if (CanActual == TamanoTaza) {
            System.out.println("Se lleno la taza");
            System.out.println("La cafetera quedo vacia");
            cafetera.setCantidadActual(0);
        } else {
            System.out.println("La taza se lleno completamente");
            System.out.println("La cafetera quedo con una cantidad actual de " + Calculo);
            cafetera.setCantidadActual(Calculo);
        }
    }
        public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
            System.out.println("Se vacio por completo");
        }

    public void agregarCafe(Cafetera cafetera) {
        System.out.println("Ingrese la cantidad de cafe que sea agregar:");
        int cantidad = leer.nextInt();
        int CantActual = cafetera.getCantidadActual();
        int carga = CantActual + cantidad;

        if (carga < cafetera.getCantidadMax()) {
            cafetera.setCantidadMax(carga);
            System.out.println("Se han carado " + carga + " miliLitros a la cafetera");
            System.out.println("La cantidad actual es: " + cafetera.getCantidadActual());

        }else{
        
            System.out.println("[ERROR] La cantidad que desea cargar supera la cantidad maxima");
            System.out.println("La cantidad actual es:" + cafetera.getCantidadActual());
            System.out.println("La cantidad maxima es:" + cafetera.getCantidadMax());
        
        }
    }
}
