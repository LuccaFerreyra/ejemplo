
package ejercicio6;


public class NesPresso {

  
    public static void main(String[] args) {
        ServicioCafetera servicio = new ServicioCafetera();
        Cafetera Cafe1 = servicio.crearCafetera();
        servicio.llenarCafetera(Cafe1);
        servicio.servirTaza(Cafe1);
        servicio.agregarCafe(Cafe1);
        servicio.vaciarCafetera(Cafe1);
    }
    
}
